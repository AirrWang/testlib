package com.mhd.basekit.viewkit.util;

import android.app.Application;
import android.content.Context;

import com.example.muheda.mhdsystemkit.sytemUtil.functionutil.MMKVUtil;
import com.example.muheda.mhdsystemkit.sytemUtil.uiutil.SpannableStringUtils;
import com.example.muheda.mhdsystemkit.sytemUtil.SystemKit;
import com.mhd.basekit.viewkit.view.refreshView.MHDFooter;
import com.mhd.basekit.viewkit.view.refreshView.MHDHeader;
import com.muheda.customrefreshlayout.MRefreshLayout;
import com.scwang.smartrefresh.layout.api.DefaultRefreshFooterCreator;
import com.scwang.smartrefresh.layout.api.DefaultRefreshHeaderCreator;
import com.scwang.smartrefresh.layout.api.RefreshFooter;
import com.scwang.smartrefresh.layout.api.RefreshHeader;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.zhouyou.http.EasyHttp;

/**
 * @author zhangming
 * @Date 2019/4/3 15:00
 * @Description: basekit中需要初始化的地方
 */
public class InitBasekit {
    public static void init(Context mContext){
        EasyHttp.init((Application) mContext);
        SystemKit.init((Application) mContext);
        SpannableStringUtils.init((Application) mContext);
        MMKVUtil.init(mContext);

        initRefresh();
    }

    private static void initRefresh() {
        MRefreshLayout.setDefaultRefreshHeaderCreator(new DefaultRefreshHeaderCreator() {
            @Override
            public RefreshHeader createRefreshHeader(Context context, RefreshLayout layout) {
                //                layout.setPrimaryColorsId(com.muheda.customrefreshlayout.R.color.colorPrimary, com.muheda.customrefreshlayout.R.color.colorPrimaryDark);//全局设置主题颜色
                return new MHDHeader(context);//.setTimeFormat(new DynamicTimeFormat("更新于 %s"));//指定为经典Header，默认是 贝塞尔雷达Header
            }
        });
        //设置全局的Footer构建器
        MRefreshLayout.setDefaultRefreshFooterCreator(new DefaultRefreshFooterCreator() {
            @Override
            public RefreshFooter createRefreshFooter(Context context, RefreshLayout layout) {
                //指定为经典Footer，默认是 BallPulseFooter
                return new MHDFooter(context);
            }
        });
    }
}
