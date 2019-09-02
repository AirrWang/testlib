package com.mhd.basekit.viewkit.util.route.service;

import android.content.Context;
import android.content.Intent;

import com.alibaba.android.arouter.launcher.ARouter;
import com.mhd.basekit.viewkit.util.route.RouteConstant;

/**
 * Created by wangfei on 2019/4/12.
 */
public class ShareRouterService {
    public static void toShare(Context context, String getDataUrl) {
        IShareService shareService = (IShareService) ARouter.getInstance().build(RouteConstant.Share_Task).navigation();
        if (shareService != null) {
            shareService.toShare(context, getDataUrl);
        }
    }

    public static void toShare(Context context, String url, String title, String content) {
        IShareService shareService = (IShareService) ARouter.getInstance().build(RouteConstant.Share_Task).navigation();
        if (shareService != null) {
            shareService.toShare(context, url, title, content);
        }
    }

    public static void toShare(Context context, boolean isShowWB, String url, String title, String content) {
        IShareService shareService = (IShareService) ARouter.getInstance().build(RouteConstant.Share_Task).navigation();
        if (shareService != null) {
            shareService.toShare(context, isShowWB, url, title, content);
        }
    }

    public static void setWBListener(Intent intent, IWBShareResult iwbShareResult) {
        IShareService shareService = (IShareService) ARouter.getInstance().build(RouteConstant.Share_Task).navigation();
        if (shareService != null) {
            shareService.setWBListener(intent, iwbShareResult);
        }
    }

    public static void dismiss() {
        IShareService shareService = (IShareService) ARouter.getInstance().build(RouteConstant.Share_Task).navigation();
        if (shareService != null) {
            shareService.dismiss();
        }
    }
}
