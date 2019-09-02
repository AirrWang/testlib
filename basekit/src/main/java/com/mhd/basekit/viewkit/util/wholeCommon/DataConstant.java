package com.mhd.basekit.viewkit.util.wholeCommon;

import com.example.muheda.mhdsystemkit.sytemUtil.functionutil.PhoneUtils;

/**
 * Created by 13660 on 2019/4/1.
 */

public class DataConstant {

    public static final boolean DEVELOPER_MODE = false;

    //数据常量
    public static final String ISFRISTUSE = "ISFRISTUSE"; //是否是首次
    public static final String METHODJSBACK = "{\"method\": \"jsBack\"}";
    public static final String WEBCONFIRMTRUE = "{\"confirm\":\"1\"}";
    public static final String WEBCONFIRMFALSE = "{\"confirm\":\"0\"}";
    public static final String WEB_CONFIRM_TRUE = "1";
    public static final String WEB_CONFIRM_FALSE = "0";

    public static final int HOME_WEBVIEW_TYPE_ONE = 1;
    public static final int HOME_WEBVIEW_TYPE_TWO = 2;
    public static final int HOME_WEBVIEW_TYPE_THREE = 3;
    public static final int HOME_WEBVIEW_TYPE_FIVE = 5;

    public static final int TEXT_ZOOM_SIZE = 260;

    public static String ip = PhoneUtils.getLocalIpAddress();
    public final static String APP_TOKEN = "appToken";

    public  static final String RESPONSE_CODE_200 = "200";
    public  static final String RESPONSE_CODE_203 = "203";
    public  static final String RESPONSE_CODE_TRUE = "true";
    public  static final String DATA_DRIVE_TITLE="驾驶行为";
    public  static final String DATA_DRIVE_CODE="1";
    public  static final String DATA_CAR_TITLE="空气质量";
    public  static final String DATA_CAR_CODE="3";
    public  static final String DATA_TRAME_TITLE="维修保养";
    public  static final String DATA_TRAME_CODE="2";
    public  static final String DATA_AUTO_TITLE="车险信息";
    public  static final String DATA_AUTO_CODE="4";

}
