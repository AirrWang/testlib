package com.example.muheda.functionkit.timestubkit;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.v4.app.FragmentActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by 13660 on 2018/8/31.
 */

public class Interval implements LifecycleObserver{
    private static Disposable disposable;
    /**
     * @param decly 周期
     * @param count 周期次数
     * @param consumer 回调
     */
    //周期性操作 可做验证码倒计时
    public static Disposable interval(FragmentActivity activity,Long decly, Long count, Consumer<Long> consumer){
        try {
            activity.getLifecycle().addObserver(Interval.class.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        disposable=Observable.interval(decly, TimeUnit.SECONDS)
               .take(count)
               .subscribeOn(Schedulers.io())
               .observeOn(AndroidSchedulers.mainThread())
               .subscribe(consumer);
        return disposable;

    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public static void onDestory(){
        if (disposable!=null){
            disposable.dispose();
            disposable=null;
        }

    }




}
