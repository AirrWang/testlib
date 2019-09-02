package com.mhd.basekit.viewkit.view;

import android.content.pm.ActivityInfo;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

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

public abstract class BaseDBActivity<VB extends ViewDataBinding> extends BaseActivity implements ReplaceInterface {

    public static final int NET_STATE_DISMISS = 1;
    public static final int NET_STATE_NO_DATA = 2;
    public static final int NET_STATE_ERROR = 4;

    protected final String NET_LOADING = "NET_LOADING";
    protected final String NET_NO_DATA = "NET_NO_DATA";
    protected final String NET_ERROR = "NET_ERROR";

    protected VB mBinding;

    protected Map<String, Class> stateMapConfig;

    protected abstract int getLayoutDBId();

    protected abstract void initDBView();

    protected abstract void initDB();

    protected abstract void initMvp(Bundle savedInstanceState);

    protected abstract void initConfig();

    protected abstract void replaceDBLoad();

    private boolean isShow = true;//决策是否展示 主要用于列表首次进入展示 刷新的时候不展示
    protected CustomTitleView base_title;
    private BaseDialogShow mGlobalLoadDialogShow;
    private BaseDialogShow mDialogShow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        View rootView = getLayoutInflater().inflate(this.getLayoutDBId(), null, false);
        mBinding = DataBindingUtil.bind(rootView);
        super.setContentView(rootView);
        base_title = (CustomTitleView) findViewById(R.id.base_title);
        initStateMapConfig();
        initMvp(savedInstanceState);
        initConfig();
        initDBView();
        initDB();
        initBaseView();
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

    protected void initBaseView() {
        View decorView = this.getWindow().getDecorView();
        View root = decorView.findViewById(R.id.layout_root);
        View netView = decorView.findViewById(R.id.ll_load_page);
        if (root != null && netView != null && (root.getBackground() instanceof ColorDrawable) && ((ColorDrawable) root.getBackground()).getColor() == getResources().getColor(R.color.color_f7f7f7)) {
            netView.setBackground(root.getBackground());
        }
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
            mGlobalLoadDialogShow.show(this);
        }
        if (mDialogShow != null && !mDialogShow.isShowing()) {
            mDialogShow.show(this);
        }
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
