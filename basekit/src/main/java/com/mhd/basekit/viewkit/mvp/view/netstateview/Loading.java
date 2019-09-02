package com.mhd.basekit.viewkit.mvp.view.netstateview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.example.muheda.mhdsystemkit.systemUI.stateView.BaseView;
import com.mhd.basekit.R;
import com.mhd.basekit.databinding.NetLoadingBinding;
import com.muheda.imageloader.ImageLoader;

import java.util.HashMap;

/**
 * 加载中
 */
public class Loading extends BaseView<Object, NetLoadingBinding> {


    public Loading(Context context, Object data, ViewGroup parent) {
        super(context, data, parent);
    }

    @Override
    public int getLayoutId() {
        return R.layout.net_loading;
    }

    @Override
    protected void initView(View view, boolean isUpdate) {
        if (!isUpdate) {
            ImageLoader.loadImageViewDynamicGif(view.getContext(), R.drawable.loading, (ImageView) view.findViewById(R.id.iv_load));
        }
    }

    @Override
    protected void initListener(View view, boolean isUpdate) {

    }

    @Override
    protected void initViewConfigure(HashMap<String, Class> viewConfigure) {

    }

    @Override
    protected ConbinationBuilder combinationViewBuilder() {
        return null;
    }
}
