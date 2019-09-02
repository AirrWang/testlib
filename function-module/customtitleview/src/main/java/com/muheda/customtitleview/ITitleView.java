package com.muheda.customtitleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * 当使用自定义title时,实现此类即可(包括左中右下的布局都要继承此类)
 */

public abstract class ITitleView {

    private View root;

    public ITitleView(Context context){
        root = LayoutInflater.from(context).inflate(getLayoutId(),null,false);
        initView(root);
        initListener(root);
    }

    protected abstract void initListener(View view);

    protected abstract void initView(View view);

    public abstract int getLayoutId();

    public View getView(){
        return root;
    }
}
