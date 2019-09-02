package com.mhd.basekit.viewkit.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.widget.Toast;


import com.example.muheda.mhdsystemkit.sytemUtil.SystemKit;
import com.mhd.basekit.viewkit.util.oldUtil.MessageVersionDto;
import com.mhd.basekit.viewkit.util.oldUtil.UserInfoEntity;

import org.json.JSONException;
import org.json.JSONObject;

public class Common {
    /**
     * 用户ip
     */
    public static String ip = "";
    /**
     * 登录成功用户token
     */
    public static String uuid = "";
    public static String scoreUuid = "";
    public static String sessionId = "";
    public static String domain = "";
    public static String cookieString = "";
    /**
     * 用户信息
     */
    public static UserInfoEntity user = null;
    public static MessageVersionDto messageVersionDto = null;
    public static Activity activity = null;

    public static final String version = Common.getCurrentVersion(SystemKit.getContext());

    private static String deviceId;
    private static int deviceType;
    private static String deviceReportId;
    private static int deviceReportType;
    private static String imei = "";
    /**
     * 正式服务器
     */

//        public static String url = "https://passport.muheda.com";//认证中心
//        public static String scoreUrl = "http://center.dtbpoint.com";//点通宝
//        public static String mallurl = "https://shop.muheda.com";//商城
//        public static String carUrl4 = "http://idsw.muheda.com/IDSW/";
//        public static String carUrl5 = "https://4s.muheda.com/";
//        public static String DevieceMsg = "http://www.database88.com/";//设备空气净化器列表
//        public static String LANDURL = "https://server.muheda.com";
//
//
//        public static String DevieceMsg_Legn = "http://coldchain.muheda.com";//设备冷链接口
//        public static String MHD_DEVICES = "https://client.muheda.com/";

    /**测试仿真3307服务器*/

//        public static String mallurl = "https://shoptest.muheda.com";
//       public static String carUrl5 = "https://4stest.muheda.com";
//       public static String url = "https://passporttest.muheda.com";
//        public static String LANDURL = "http://servertest.muheda.com";
//        public static String MHD_DEVICES = "http://clienttest.muheda.com/";
//
//        public static String scoreUrl = "http://120.76.31.87:8084/";//点通宝
//        public static String DevieceMsg_Legn = "http://coldchaintest.muheda.com";//设备冷链接口
//        public static String carUrl4 = "http://idswtest.muheda.com/IDSW/";
//        public static String DevieceMsg = "http://qtlrtest.muheda.com/";//设备空气净化器列表

    /**
     * 测试仿真3308服务器
     */


    public static String mallurl = "https://shoptemporary.muheda.com";
    public static String carUrl5 = "https://4stemporary.muheda.com";
    public static String url = "https://passporttemporary.muheda.com";
    public static String LANDURL = "http://servertemporary.muheda.com";
    public static String MHD_DEVICES = "http://clienttemporary.muheda.com/";

    public static String scoreUrl = "http://120.76.31.87:8084/";//点通宝
    public static String DevieceMsg_Legn = "http://coldchaintemporary.muheda.com";//设备冷链接口
    public static String carUrl4 = "http://idswtemporary.muheda.com/IDSW/";
    public static String DevieceMsg = "http://qtlrtemporary.muheda.com/";//设备空气净化器列表
    public static String carSafe = "http://idswtemporary.muheda.com/datambidas/";//安全行车数据传输

    /**
     * 测试内网服务器
     */
    /*public static String mallurl = "https://shopceshi.muheda.com";
    public static String carUrl5 = "https://4sceshi.muheda.com";
    //    public static String carUrl5 = "https://db4stest.muheda.com";
    public static String url = "https://passportceshi.muheda.com";
    public static String LANDURL = "https://serverceshi.muheda.com";//测试*/

    //无变化服务
    //    public static String scoreUrl = "http://120.76.31.87:8084/";//点通宝
    //    public static String carUrl4 = "http://172.17.3.174:8765/IDSW/";


    /**
     * 内网（外网阿里云）
     */

    //    public static String carUrl4 = "http://211.99.236.172:8765/IDSW/";

    //    public static String DevieceMsg = "http://idswtest.muheda.cn:8050/AirMonitor/";//设备空气净化器列表
    //    public static String DevieceMsg_Mo = "http://idswtest.muheda.cn:18080/";//设备 //添加冷链设备
    //    public static String DevieceMsg = "http://idswtest.muheda.cn:8050/AirMonitor/";//设备空气净化器列表
    //    public static String DevieceMsg_Mo = "http://idswtest.muheda.cn:18080/";//设备 //添加冷链设备

    //        public static String DevieceMsg_Legn = "http://idswtest.muheda.cn:18080";//设备冷链接口
    // public static String DevieceMsg_Legn = "http://101.200.36.32:18080";//设备冷链接口


    //    public static String DevieceMsg = "http://qtlrceshi.muheda.cn/AirMonitor/";//设备空气净化器列表


    //    public static String DevieceMsg = "http://qtlrnewceshi.muheda.cn/";//设备空气净化器列表      2018.10.26清天朗日新架构qtlrnewceshi.muheda.cn
    //    public static String DevieceMsg_Mo = "http://idswtest.muheda.cn:18080/";//设备 //添加冷链设备


    //    public static String DevieceMsg_Legn = "http://idswceshi.muheda.cn";//设备冷链接口
    // public static String DevieceMsg_Legn = "http://101.200.36.32:18080";//设备冷链接口


    // 微信分享AppId
    public final static String weixinAppId = "wxef21a06253271f7d";


    //单点登录
    public final static String landUrl = "https://serverceshi.muheda.com";

    public final static String userYsUrl = Common.MHD_DEVICES + "MHD_privacyPact/MHD_privacyPact.html";//睦合达隐私权政策

    public final static String getUserMonthlyRewardInfo = "/api/point/getRewardContent.html";

    public final static String updateArticleStatus = "/api/center/subsidyUnfreeze/updateArticleStatus.html";//阅读文章
    public final static String updatePropagandaStatus = "/api/center/subsidyUnfreeze/updatePropagandaStatus.html";//更新安全宣传状态
    public final static String obdServiceBind = "/app/bindOrderWithOBD.html";//OBD设备绑定
    public final static String agreePrivacyProtocol = "/app/api/account/agreePrivacyProtocol.html";//用户同意隐私协议接口
    public final static String searchOBDOrderInfo = "/api/searchOBDOrderInfo.html";//OBD订单设备状态查询


    public final static String dfTravelTimesList = "api/grading/dfTravelTimesList";//查询解冻行程次数
    public final static String dfTravelTimesMallList = "/app/api/score/getDrivingSafeHomePageByOrder.html";//查询商城解冻行程次数


    public final static String getAll = "/app/order/serverPackage/getAll.htm";//查询订单服务包列表
    public final static String getCarOrderInfo = "/app/order/getCarOrderInfo.htm";//查询订单车牌列表
    public final static String getCarCardList = "/app/careCard/list.htm";//查询订单车牌列表



    /**
     * 获取验证码倒计时变化
     */
    public static final int GET_VERIFICATION_CODE_COUNT_DOWN_CHANGE = 1000;
    public static final int RETURN_OPENID_ACCESSTOKEN = 1600;

    /**
     * 正面照文件上传进度
     */
    public static final int FONT_FILE_UPDATE_PROGRESS = 1111;
    /**
     * 反面照文件上传进度
     */
    public static final int BACK_FILE_UPDATE_PROGRESS = 1112;
    /**
     * 手持正面照文件上传进度
     */
    public static final int HAND_FRONT_FILE_UPDATE_PROGRESS = 1113;
    /**
     * 头像上传进度
     */
    public static final int HEAD_FILE_UPDATE_PROGRESS = 1114;

    public static final int DELETVT_CAR = 11188;
    /**
     * 支付的点击
     */
    public static final int GO_TO_PAY = 1115;
    public static final int GO_TO_PAY_A = 11015;
    public static final int GO_TO_PAY1 = 1116;
    public static final int CE_XIAO_TUIHUO = 1118;

    public static final int SEREWREWW_SDFSF = 1119;

    /**
     * 登录成功
     */
    public static final int LOGIN_SUCCESS = 10001;
    /**
     * 登录失败
     */
    public static final int LOGIN_FAILED_FOR_VERCODE = 100015;
    public static final int GET_MARKET_NOTICE_SUCCESS = 11102;
    /**
     * 登录失败
     */
    public static final int LOGIN_FAILED = 10002;
    public static final int GET_MARKET_NOTICE_SUCCESST = 111402;


    /**
     * 保修协议
     */
    public static final int GET_MARKET_NOTICE_FAILED = 10110;

    /**
     * 绑定点通宝账户成功
     */
    public static final int BINDING_SCORE_USEREND_SUCCESS = 10003;
    public static final int BINDING_SCORE_USEREND_QC = 100043;
    public static final int BINDING_SCORE_USEREND_QE = 1000437;
    public static final int BINDING_SCORE_USEREND_QO = 1000433;
    public static final int BINDING_SCORE_UNCHAREEN = 1000789;
    public static final int BINDING_SCORE_USEREND_SUCCESSD = 100053;
    public static final int BINDING_SCORE_USEREND_CHAZUO = 1000388;
    public static final int BINDING_SCORE_USEREND_JINGHUAQ = 10005388;
    public static final int BINDING_SCORE_USEREND_JINGHUAQI = 100038;
    public static final int BINDING_SCORE_USEREND_JIANCEQI = 100030;
    public static final int ADDTOSHOPPINGCAR_FAILEDT = 1000306;
    public static final int GET_VERSION_SUCCESS_KDIEIE = 1000346;
    public static final int GET_VERSION_SUCCESS_KDIEISDDE = 1100346;
    /**
     * 绑定点通宝账户失败
     */
    public static final int BINDING_SCORE_USEREND_FAILED = 10004;
    public static final int BINDING_SCORE_USEREND_FRRD = 14004;
    public static final int BINDING_SCORE_USEREND_SEEER = 100404;
    public static final int BINDING_SCORE_USEREND_FAILEDE = 100044;

    public static final int BINDING_SCORE_USEREND_FAILEDD = 14404;

    /**
     * 获取apk信息成功
     */
    public static final int GET_VERSION_SUCCESS = 10005;
    public static final int query_Integral_GoodsList_success = 10121;
    public static final int query_Integral_GoodsList_FAILED = 10122;
    public static final int SERVICE_SHOWMORE = 101623;
    public static final int ADDTOSHOPPINGCARSUSE_FAILEDT = 105623;
    public static final int UPDATE_BIKE_MILES_FAILE = 105624;

    /**
     * 扫描服务卡信息
     * //                "200：录入消费信息成功
     * //                400：录入消费信息失败
     * //                501：参数为空
     * //                502：系统错误，用户不存在
     * //                503：消费信息为空
     * //                504：消费次数不能小于0
     * //                505：消费信息错误
     * //                506：某服务剩余消费次数不足
     * //                507：某服务该消费周期内已消费
     * //                508：限制消费服务一个周期只能消费一次
     * //                300：二维码不正确
     * //                301：请在指定门店使用
     * //                302：服务卡已过期
     * //                303：服务卡已用完
     * //                304：基金会审核完成后才可使用
     * //                305：设备服务卡确认安装设备后才可使用！"
     */
    public static final int LURUXIAOXISHIBAI = 123213;
    public static final int CANSHUWEIKONG = 123126;
    public static final int XITONGCUOWU = 123127;
    public static final int XIAOFEIXINXIWEIK = 123128;
    public static final int XIFEICISHUBUNENGXIAOYULING = 123129;
    public static final int XIAOFEIXINXICUOWU = 123110;
    public static final int XIFEICISHUBUZHU = 123120;
    public static final int XIAOFEIZHOUQI = 123130;
    public static final int XIAOFEICISHU = 123140;
    public static final int WEIMABUZHENGQUE = 1231250;
    public static final int ZHIDINGWENDIANSHIY = 123160;
    public static final int FUWUKAGUOQI = 123170;
    public static final int FUWUKAYIWAN = 123180;
    public static final int JINJINHUISHENEHSHIC = 123190;
    public static final int ZHENGQUEANZHUANGSHEBEI = 123210;
    public static final int PUCHARSEYES = 3452347;
    public static final int PUCHARSENO = 3452348;


    /**
     * 获取apk信息失败
     */
    public static final int GET_VERSION_FAILED = 10006;

    /**
     * 绑定账户发送验证码成功
     */
    public static final int SEND_SMSCODE_FORBIND_SUCCESS = 10007;
    /**
     * 绑定账户发送验证码失败
     */
    public static final int SEND_SMSCODE_FORBIND_FAILED = 10008;

    /**
     * 查询绑定点通宝账户记录成功
     */
    public static final int SEL_BINDING_SCOREUSER_SUCCESS = 10009;
    /**
     * 查询绑定点通宝账户记录失败
     */
    public static final int SEL_BINDING_SCOREUSER_FAILED = 10010;

    /**
     * 根据点通宝用户名获取用户信息成功
     */
    public static final int GET_SUSERINFO_BYUSERN_SUCCESS = 10011;
    /**
     * 根据点通宝用户名获取用户信息失败
     */
    public static final int GET_SUSERINFO_BYUSERN_FAILED = 10012;

    /**
     * 解除绑定点通宝账户成功
     */
    public static final int UNBINDING_SCOREUSER_SUCCESS = 10013;
    /**
     * 解除绑定点通宝账户失败
     */
    public static final int UNBINDING_SCOREUSER_FAILED = 10014;

    /**
     * 更换邮箱（新）-发送邮箱验证码成功
     */
    public static final int SEND_NEWEMAIL_SUCCESS = 10015;
    /**
     * 更换邮箱（新）-发送邮箱验证码失败
     */
    public static final int SEND_NEWEMAIL_FAILED = 10016;

    /**
     * 更换邮箱（新）-验证邮箱验证码成功
     */
    public static final int CHECK_NEWEMAIL_SUCCESS = 10017;
    /**
     * 更换邮箱（新）-验证邮箱验证码失败
     */
    public static final int CHECK_NEWEMAIL_FAILED = 10018;

    /**
     * 更换邮箱（旧）-发送邮箱验证码成功
     */
    public static final int SEND_OLDEMAIL_SUCCESS = 10019;
    /**
     * 更换邮箱（旧）-发送邮箱验证码失败
     */
    public static final int SEND_OLDEMAIL_FAILED = 10020;

    /**
     * 更换邮箱（旧）-验证邮箱验证码成功
     */
    public static final int CHECK_OLDEMAIL_SUCCESS = 10021;
    /**
     * 更换邮箱（旧）-验证邮箱验证码失败
     */
    public static final int CHECK_OLDEMAIL_FAILED = 10022;

    /**
     * 检查邮箱存在成功
     */
    public static final int IS_EMAILEXIST_SUCCESS = 10023;
    /**
     * 检查邮箱存在失败
     */
    public static final int IS_EMAILEXIST_FAILED = 10024;

    /**
     * 设置新邮箱成功
     */
    public static final int SET_USEREMAIL_SUCCESS = 10025;
    /**
     * 设置新邮箱失败
     */
    public static final int SET_USEREMAIL_FAILED = 10026;

    /**
     * 查询积分产生记录成功
     */
    public static final int SEL_SCORE_IMPORTLOG_SUCCESS = 10027;
    /**
     * 查询积分产生记录失败
     */
    public static final int SEL_SCORE_IMPORTLOG_FAILED = 10028;

    /**
     * 查询积分导出记录成功
     */
    public static final int SEL_SCORE_EXPORTLOG_SUCCESS = 10029;
    /**
     * 查询积分导出记录失败
     */
    public static final int SEL_SCORE_EXPORTLOG_FAILED = 10030;

    /**
     * 更换手机（旧）-发送短信验证码成功
     */
    public static final int SEND_OLD_MOBILE_SUCCESS = 10031;
    /**
     * 更换手机（旧）-发送短信验证码失败
     */
    public static final int SEND_OLD_MOBILE_FAILED = 10032;

    /**
     * 更换手机（旧）-验证邮箱验证码成功
     */
    public static final int CHECK_OLD_MOBILE_SUCCESS = 10033;
    /**
     * 更换手机（旧）-验证邮箱验证码失败
     */
    public static final int CHECK_OLD_MOBILE_FAILED = 10034;

    /**
     * 更换手机（新）-发送短信验证码成功
     */
    public static final int SEND_NEW_MOBILE_SUCCESS = 10035;
    public static final int SEND_NEW_MOBILE = 1003500;
    /**
     * 更换手机（新）-发送短信验证码失败
     */
    public static final int SEND_NEW_MOBILE_FAILED = 10036;

    /**
     * 更换手机（新）-验证短信验证码成功
     */
    public static final int CHECK_NEW_MOBILE_SUCCESS = 10037;
    /**
     * 更换手机（新）-验证短信验证码失败
     */
    public static final int CHECK_NEW_MOBILE_FAILED = 10038;

    /**
     * 手机号存在检查成功
     */
    public static final int IS_MOBILE_EXIST_SUCCESS = 10039;
    /**
     * 手机号存在检查失败
     */
    public static final int IS_MOBILE_EXIST_FAILED = 10040;

    /**
     * 设置新手机号成功
     */
    public static final int SET_USER_MOBILE_SUCCESS = 10041;
    /**
     * 设置新手机号失败
     */
    public static final int SET_USER_MOBILE_FAILED = 10042;

    /**
     * 找回密码-发送短信验证码成功
     */
    public static final int SEND_FIND_PWD_SUCCESS = 10043;
    /**
     * 找回密码-发送短信验证码失败
     */
    public static final int SEND_FIND_PWD_FAILED = 10044;

    /**
     * 找回密码-验证短信验证码成功
     */
    public static final int CHECK_FIND_PWD_SUCCESS = 10045;
    /**
     * 找回密码-验证短信验证码失败
     */
    public static final int CHECK_FIND_PWD_FAILED = 10046;

    /**
     * 忘记密码-修改密码成功
     */
    public static final int FIND_PWD_SUCCESS = 10047;
    /**
     * 忘记密码-修改密码失败
     */
    public static final int FIND_PWD_FAILED = 10048;

    /**
     * 注册-获取短信验证码成功
     */
    public static final int SEND_REGISTER_SMS_SUCCESS = 10045;
    /**
     * 注册-获取短信验证码失败
     */
    public static final int SEND_REGISTER_SMS_FAILED = 10046;

    /**
     * 注册-验证短信验证码成功
     */
    public static final int CHECK_REGISTER_SMS_SUCCESS = 10047;
    /**
     * 注册-验证短信验证码失败
     */
    public static final int CHECK_REGISTER_SMS_FAILED = 10048;

    /**
     * 注册成功
     */
    public static final int REGISTER_SUCCESS = 10049;
    /**
     * 注册失败
     */
    public static final int REGISTER_FAILED = 10050;

    /**
     * 修改用户信息成功
     */
    public static final int UPDATE_USERINFO_SUCCESS = 10051;
    public static final int UPDATE_USERINFO_SUCCESSMAX = 100514;
    /**
     * 修改用户信息失败
     */
    public static final int UPDATE_USERINFO_FAILED = 10052;

    /**
     * 用户名存在检查成功
     */
    public static final int IS_USERNAME_EXIST_SUCCESS = 10053;
    /**
     * 用户名存在检查失败
     */
    public static final int IS_USERNAME_EXIST_FAILED = 10054;

    /**
     * 修改密码成功
     */
    public static final int UPDATE_PWD_SUCCESS = 10055;
    /**
     * 修改密码失败
     */
    public static final int UPDATE_PWD_FAILED = 10056;

    /**
     * 手机号存在检查成功-找回密码
     */
    public static final int IS_FIND_PWD_MOBILE_EXIST_SUCCESS = 10057;
    /**
     * 手机号存在检查失败-找回密码
     */
    public static final int IS_FIND_PWD_MOBILE_EXIST_FAILED = 10058;

    /**
     * 获取车辆信息成功
     */
    public static final int SDFEFWEFVSSDF = 10659;
    public static final int FREEZEINTEGRA_ADVERT = 10759;
    public static final int FREEZEINTEGRA_SUCCESSDEVICE = 10859;
    /**
     * 获取车辆信息失败
     */
    public static final int GET_CAR_INFO_FAILED = 10060;

    /**
     * 积分导出成功
     */
    public static final int SCORE_EXPORT_SUCCESS = 10061;
    /**
     * 积分导出失败
     */
    public static final int SCORE_EXPORT_FAILED = 10062;

    /**
     * 异地登录成功
     */
    public static final int REMOTE_LOGIN_SUCCESS = 10063;
    /**
     * 异地登录失败
     */
    public static final int REMOTE_LOGIN_FAILED = 10064;

    /**
     * 登陆-发送短信验证码成功
     */
    public static final int SEND_LOGIN_SUCCESS = 10065;
    /**
     * 登陆-发送短信验证码失败
     */
    public static final int SEND_LOGIN_FAILED = 10066;

    /**
     * 退出登录成功
     */
    public static final int LOGOUT_SUCCESS = 10067;
    /**
     * 退出登录失败
     */
    public static final int LOGOUT_FAILED = 10068;

    /**
     * 获取用户信息成功
     */
    public static final int GET_USER_INFO_SUCCESS = 10069;
    /**
     * 获取用户信息失败
     */
    public static final int GET_USER_INFO_FAILED = 10070;

    /**
     * 获取用户持有积分信息成功
     */
    public static final int GET_SCORE_SUCCESS = 10071;
    /**
     * 获取用户持有积分信息失败
     */
    public static final int GET_SCORE_FAILED = 10072;

    /**
     * 获取添加点通宝绑定账户信息成功
     */
    public static final int GET_ACCOUNT_SUCCESS = 10073;
    public static final int MEESAGE_PUSH = 10673;


    public static final int GET_ACCSETT_SUCCESS = 10077;
    /**
     * 获取添加点通宝绑定账户信息失败
     */
    public static final int GET_ACCOUNT_FAILED = 10074;

    /**
     * 我的奖励
     */
    public static final int GET_WODE_JIANGLI = 10712;


    public static final int GET_WODE_JIANGLIJIBU = 107124;
    public static final int GET_WODE_JIANGLISHARE = 107125;
    public static final int GET_WODE_JIANGLIPIAN = 102712;
    /**
     * 获取给用户发送积分委托短信验证码成功
     */
    public static final int GET_CODE_SUCCESS = 10075;
    /**
     * 获取给用户发送积分委托短信验证码失败
     */
    public static final int GET_CODE_FAILED = 10076;

    /**
     * 上传身份证正面照成功
     */
    public static final int UPLOAD_ID_CARD_FRONT_SUCCESS = 10077;
    /**
     * 上传身份证正面照失败
     */
    public static final int UPLOAD_ID_CARD_FRONT_FAILED = 10078;

    /**
     * 上传身份证反面照成功
     */
    public static final int UPLOAD_ID_CARD_BACK_SUCCESS = 10079;
    /**
     * 上传身份证反面照失败
     */
    public static final int UPLOAD_ID_CARD_BACK_FAILED = 10080;

    /**
     * 上传手持身份证正面照成功
     */
    public static final int UPLOAD_ID_CARD_HAND_FRONT_SUCCESS = 10081;
    /**
     * 上传手持身份证正面照失败
     */
    public static final int UPLOAD_ID_CARD_HAND_FRONT_FAILED = 10082;

    /**
     * 上传积分委托成功
     */
    public static final int UPLOAD_ID_CARD_APPROVE_SUCCESS = 10083;
    /**
     * 上传积分委托失败
     */
    public static final int UPLOAD_ID_CARD_APPROVE_FAILED = 10084;

    /**
     * 上传通过手机号获取账户信息成功
     */
    public static final int UPLOAD_ID_CARD_FIND_SUCCESS = 10085;
    /**
     * 上传通过手机号获取账户信息失败
     */
    public static final int UPLOAD_ID_CARD_FIND_FAILED = 10086;

    /**
     * 查询解绑点通宝账户剩余天数成功
     */
    public static final int UPLOAD_ID_CARD_QUERY_SUCCESS = 10087;
    /**
     * 查询解绑点通宝账户剩余天数失败
     */
    public static final int UPLOAD_ID_CARD_QUERY_FAILED = 10088;

    /**
     * 解绑点通宝账户成功
     */
    public static final int UPLOAD_ID_CARD_UNWRAP_SUCCESS = 10089;
    /**
     * 解绑点通宝账户失败
     */
    public static final int UPLOAD_ID_CARD_UNWRAP_FAILED = 10090;

    /**
     * 添加点通宝账户成功
     */
    public static final int Add_SUCCESS = 10091;
    public static final int SOUYE_SHOPPING = 104091;
    public static final int SOUYE_SHOPPING_DATA_SUCCESS = 0x0041;
    public static final int SOUYE_SHOPPING_DATA_FAILED = 104042;
    /**
     * 添加点通宝账户失败
     */
    public static final int Add_FAILED = 10092;

    /**
     * 实名认证申请成功
     */
    public static final int AUTONYM_SUCCESS = 10093;
    /**
     * 实名认证申请失败
     */
    public static final int AUTONYM_FAILED = 10094;

    public static final int XINGCHE_SUCCESS = 11094;
    public static final int SCARESULTE = 113094;

    public static final int XINGCHE_DELECT = 11097;

    public static final int XINGCHE_FAILED = 10194;

    /**
     * 头像上传成功
     */

    public static final int AUTONYM_FAILEDS = 10090;
    public static final int HEAD_IMG_UPLOAD_SUCCESS = 10095;

    public static final int JIFEN_SUCEESS = 100999;

    public static final int JIFEN_SUCEESST = 100199;

    public static final int GERENZHONGXIN = 101095;
    /**
     * 头像上传失败
     */
    public static final int HEAD_IMG_UPLOAD_FAILED = 10096;





    /**
     * 获取积分卡信息成功
     */
    public static final int BLOCK_SUCCESS = 10097;
    /**
     * 获取积分卡信息失败
     */
    public static final int BLOCK_FAILED = 10098;

    /**
     * 兑换积分卡成功
     */
    public static final int CARD_SUCCESS = 10099;
    /**
     * 兑换积分卡失败
     */
    public static final int CARD_FAILED = 10100;

    /**
     * 4s点获取信息
     */
    public static final int DRIVE_SUCCESS = 10101;
    public static final int DRIVE_SUCCESSRRR = 140101;
    public static final int DRIVE_SUCCESSShOP = 1401055;
    public static final int DRIVE_SUCCESSSHOPY = 140155;
    public static final int DRIVE_SUCCESST = 101013;
    public static final int DRIVE_FAILED = 10102;

    /**
     * 车用户获取信息
     */
    public static final int HOMEPAGE_SUCCESS = 10103;
    public static final int HOMEPAGE_FAILED = 10104;

    /**
     * 广告轮播
     */
    public static final int ADVERTISEMENT_SUCCESS = 10105;
    public static final int ADVERTISEMENT_FAILED = 10106;

    /**
     * 获取商家支付宝信息
     */
    public static final int GET_CMYZFB_INFO_SUCCESS = 10107;
    public static final int GET_CMYZFB_INFO_SUCCESS1 = 101078;
    public static final int GET_CMYZFB_INFO_FAILED = 10108;

    /**
     * 广告页
     */
    public static final int ADVERTISE_SUCCESS = 10109;
    public static final int ADVERTISE_FAILED = 10110;

    /**
     * 查询积分记录成功
     */
    public static final int GETIELOG_SUCCESS = 10111;
    public static final int GETIELOG_SUCANDENFERF = 10171;
    /**
     * 查询积分记录失败
     */
    public static final int GETIELOG_FAILED = 10112;

    /**
     *
     */

    public static final int GETIELOG_FAILEDS = 101124;

    /**
     * 获取银行列表
     */
    public static final int GET_BANK_LIST_SUCCESS = 10113;
    public static final int GET_BANK_LIST_FAILED = 10114;

    /**
     * 获取银行列表
     */
    public static final int GET_BANK_LIST_BY_NAME_SUCCESS = 10115;
    public static final int GET_BANK_LIST_BY_NAME_FAILED = 10116;

    /**
     * 获取银行列表
     */
    public static final int SELECT_SUBBANK_HEAD_BANK_SUCCESS = 10117;
    public static final int SELECT_SUBBANK_HEAD_BANK_FAILED = 10118;

    /**
     * 获取dialog的类型
     */
    public static final int FREEZEINTEGRA_NO_NEED = 10119;
    public static final int FREEZEINTEGRA_SUCCESS = 10120;
    public static final int FREEZEINTEGRA_SUCCESSE = 10124;
    public static final int FREEZEINTEGRA_SUCCESSET = 10126;
    public static final int FREEZEINTEGRA_FAILED = 10121;

    public static final int FREEZEINTEGRA_FAILEDE = 1013421;
    public static final int FREEZEINTEGRA_FAILEDT = 101331;
    public static final int ADDTOSHOPPINGCAR_SUCCESS = 1013422;

    public static final int FREEZEINTEGRABIKE_SUCCESS = 1012012;
    public static final int ADDTOGOUMAI_SUCCESS = 1013424;
    public static final int ADDTOGOUMAI_FAILEDT = 1013425;
    private static Toast toast;
    /*点保值状态码*/
    public static final int ASDFWEFEERFWE = 1234223;
    public static final int ASDFWEFVWEFWE = 3453212;
    public static final int VAEFAECVADSFWE = 2345623;
    public static final int VAEWREVASEFREVEE = 2342112;
    public static final int ASEFCVAEFREFF = 2432234;
    public static final int AEWVCDSVEWRFEWFWVE = 3452342;




    /**
     * 字符串为空
     *
     * @param
     * @return
     */
    public static boolean isEmpty(String s) {
        return s == null || "".equals(s.trim());
    }




    /**
     * Json字符串的解析
     *
     * @param obj
     * @param key
     * @return
     */
    public static String getJsonValue(JSONObject obj, String key) {
        try {
            if (obj.has(key)) {

                String value = obj.getString(key);
                if ("null".equals(value)) {
                    return "";
                } else {
                    return value;
                }
            } else {
                return "";
            }
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 获取当前应用的版本号
     */
    public static String getCurrentVersion(Context mContext) {
        try {
            // 获取packagemanager的实例
            PackageManager packageManager = mContext.getPackageManager();
            // getPackageName()是你当前类的包名，0代表是获取版本信息
            PackageInfo packInfo = packageManager.getPackageInfo(
                    mContext.getPackageName(), 0);
            return packInfo.versionName;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }




    /**
     * 手机号*号处理
     */
    public static String exChangeMobilePhone(String mobile) {
        if (mobile.length() > 11 || mobile.length() <= 5) {
            return null;
        } else {
            mobile = mobile.substring(0, 3) + "****" + mobile.substring(7);
            return mobile;
        }

    }






    public static final int CANCLE_SELL_SCORE_FAILED = 101080;
    public static final int CANCLE_SELL_SCORE_FAILEDR = 101054;
    public static final int CANCLE_SELL_SCORE_SUCCESS = 10108;

    public static UserInfoEntity getUser(){
        if (Common.user != null){
            return Common.user;
        }
        return new UserInfoEntity();
    }


    public static String token = "";

    public static String getToken() {
        return token /*= TextUtils.isEmpty(token) ? SPUtil.getString(APP_TOKEN, "") : token*/;
    }

    public static String getUuid() {
        return user == null ? "" : user.getUuid();
    }

    public static String getDeviceId() {
        return deviceId;
    }

    public static void setDeviceId(String deviceId) {
        Common.deviceId = deviceId;
    }

    public static int getDeviceType() {
        return deviceType;
    }

    public static void setDeviceType(int deviceType) {
        Common.deviceType = deviceType;
    }

    public static String getDeviceReportId() {
        return deviceReportId;
    }

    public static void setDeviceReportId(String deviceReportId) {
        Common.deviceReportId = deviceReportId;
    }

    public static int getDeviceReportType() {
        return deviceReportType;
    }

    public static void setDeviceReportType(int deviceReportType) {
        Common.deviceReportType = deviceReportType;
    }

    public static String getImei() {
        return imei;
    }

    public static void setImei(String imei) {
        Common.imei = imei;
    }
}
