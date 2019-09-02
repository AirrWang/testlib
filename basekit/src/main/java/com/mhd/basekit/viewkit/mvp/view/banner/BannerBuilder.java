package com.mhd.basekit.viewkit.mvp.view.banner;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.view.View;

import com.mhd.basekit.viewkit.mvp.view.banner.assembly.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.loader.ImageLoaderInterface;

import java.util.List;

/**
 * @author zhangming
 * @Date 2019/8/15 15:36
 * @Description: 默认构建参数, 简化banner的初始化,自动管理生命周期
 */
public class BannerBuilder implements LifecycleObserver {

    private Banner mBanner;
    private LifecycleOwner mContext;

    /**
     * 初始化轮播控件
     *
     * @param context 上下文
     * @param mBanner 轮播控件
     */
    private BannerBuilder(LifecycleOwner context, Banner mBanner) {
        this.mBanner = mBanner;
        this.mContext = context;
        initBanner();
        initLifecycle(context);
    }

    private void initLifecycle(LifecycleOwner context) {
        //添加生命周期监听
        context.getLifecycle().addObserver(this);
    }

    private void initBanner() {
        mBanner.setImageLoader(new GlideImageLoader())
                //设置banner样式
                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR)
                //设置自动轮播，默认为true
                .isAutoPlay(true)
                //设置轮播时间
                .setDelayTime(2500)
                //设置指示器位置（当banner模式中有指示器时）
                .setIndicatorGravity(BannerConfig.CENTER);
    }

    public Banner setImageLoader(ImageLoaderInterface imageLoader) {
        mBanner.setImageLoader(imageLoader);
        return mBanner;
    }

    public Banner setImages(List<?> imageUrls) {
        mBanner.setImages(imageUrls);
        return mBanner;
    }

    public Banner setOnBannerListener(OnBannerListener listener) {
        mBanner.setOnBannerListener(listener);
        return mBanner;
    }

    public Banner start() {
        mBanner.start();
        return mBanner;
    }

    /**
     * 初始化轮播控件
     *
     * @param context 上下文
     * @param banner  轮播控件
     */
    public static BannerBuilder init(LifecycleOwner context, Banner banner) {
        return new BannerBuilder(context, banner);
    }

    public Banner getBanner() {
        return mBanner;
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        if (mBanner != null) {
            mBanner.start();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        if (mBanner != null) {
            mBanner.stopAutoPlay();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        //取消生命周期监听
        mContext.getLifecycle().removeObserver(this);
    }

}
