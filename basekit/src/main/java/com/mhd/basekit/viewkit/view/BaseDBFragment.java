package com.mhd.basekit.viewkit.view;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mhd.basekit.R;
import com.mhd.basekit.viewkit.util.ReplaceInterface;
import com.mhd.basekit.viewkit.view.dialog.BaseDialogShow;
import com.mhd.basekit.viewkit.view.dialog.GlobalLoadDialogShow;
import com.muheda.customtitleview.CustomTitleView;
import com.muheda.customtitleview.ITitleView;

import java.util.Map;

/**
 * Created by 13660 on 2018/10/22.
 */

public abstract class BaseDBFragment<VB extends ViewDataBinding> extends Fragment implements ReplaceInterface {

    public static final int NET_STATE_DISMISS = 1;
    public static final int NET_STATE_NO_DATA = 2;
    public static final int NET_STATE_ERROR = 4;

    protected final String NET_LOADING = "NET_LOADING";
    protected final String NET_NO_DATA = "NET_NO_DATA";
    protected final String NET_ERROR = "NET_ERROR";

    protected VB mBinding;

    protected Map<String, Class> stateMapConfig;

    protected abstract int getLayoutDBId();

    protected abstract void initMvp(Bundle savedInstanceState);

    protected abstract void initConfig();

    protected abstract void initDBView();

    protected abstract void initDB();

    protected abstract void replaceDBLoad();

    private boolean isShow = true;//决策是否展示 主要用于列表首次进入展示 刷新的时候不展示
    protected CustomTitleView base_title;
    private BaseDialogShow mGlobalLoadDialogShow;
    private BaseDialogShow mDialogShow;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, getLayoutDBId(), container, false);
        base_title = mBinding.getRoot().findViewById(R.id.base_title);
        initStateMapConfig();
        initMvp(savedInstanceState);
        initConfig();
        initDBView();
        initDB();
        return mBinding.getRoot();
    }

    @Override
    public void replace() {
        replaceDBLoad();
    }

    protected void hideLeftBack(boolean isHide) {
        base_title.enableLeftShow(isHide);
    }

    protected void setTitle(String title) {
        base_title.setTitle(title);
    }

    protected void initStateMapConfig() {
        mDialogShow = new GlobalLoadDialogShow<>().init(this);
        mGlobalLoadDialogShow = mDialogShow;
        stateMapConfig = ((GlobalLoadDialogShow) mDialogShow).getMMapConfig();
    }

    public void setDialog(BaseDialogShow dialogShow) {
        mDialogShow = dialogShow;
    }

    /**
     * 自定义左侧布局
     *
     * @param titleView
     */
    protected void setTitleLeftLayout(ITitleView titleView) {
        base_title.setTitleLeftLayout(titleView);
    }

    /**
     * 自定义中间布局
     *
     * @param titleView
     */
    protected void setTitleCenterLayout(ITitleView titleView) {
        base_title.setTitleCenterLayout(titleView);
    }

    /**
     * 自定义右侧布局
     *
     * @param titleView
     */
    protected void setTitleRightLayout(ITitleView titleView) {
        base_title.setTitleRightLayout(titleView);
    }

    /**
     * 顶部全自定义布局
     *
     * @param titleView
     */
    protected void setCustomTitle(ITitleView titleView) {
        base_title.setCustomTitle(titleView);
    }


    protected void setIsShow(boolean isShow) {
        this.isShow = isShow;
    }

    protected boolean isShow() {
        return isShow;
    }

    protected void showLoading() {
        if (isShow()) {
            mGlobalLoadDialogShow.show(this.getActivity());
        }
        if (mDialogShow != null && !mDialogShow.isShowing()) {
            mDialogShow.show(this.getActivity());
        }
    }

    public void dismiss() {
        mGlobalLoadDialogShow.dismiss(NET_STATE_DISMISS);
    }

    protected void dismiss(int type) {
        //type 1 成功 2 成功-数据为空 (包括非200) 4 请求失败  网络
        if (isShow()) {
            mGlobalLoadDialogShow.dismiss(type);
        }
        if (mDialogShow != null) {
            mDialogShow.dismiss(type);
        }
    }
}
