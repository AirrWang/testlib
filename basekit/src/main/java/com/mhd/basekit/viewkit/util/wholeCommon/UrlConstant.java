package com.mhd.basekit.viewkit.util.wholeCommon;

import com.mhd.basekit.viewkit.util.Common;

/**
 * Created by 13660 on 2019/4/1.
 */

public class UrlConstant {

    public static final String SHOP_URL = Common.mallurl;//商城
    public static final String STORES_4S = Common.carUrl5;//4s店
    public static final String USER_CENTER = Common.url;//用户中心
    public static final String IDSW = Common.carUrl4;//idsw

    public static final String INTELLIGENT_DRIVE = "http://testinsurance.muheda.com:55596/insurance-intelligent-driving";//智能驾驶接口测试
    public static final String MHD_WEB = "https://clienttemporary.muheda.com";//web地址域名

    //    public static final String INTELLIGENT_DRIVE = "https://insurance.muheda.com/insurance-intelligent-driving";//智能驾驶接口测试
    //    public static final String MHD_WEB = "https://insurance.muheda.com";//web地址域名


    //home 首页
    public static final String HOME_SHOP = "/mobile/appLogin.htm";
    public static final String HOME_DATA = "/app/indexData.htm";
    public static final String SHOP_LOAD = "/app/queryCommonGoodsList.htm";
    public static final String HOME_SEARCH = "/app/searchCommonGoods.htm";
    public static final String HOME_FLOOR_DETAIL = "/app/restful_getFloorGoods.htm";
    public static final String DATA = "/app/dataGoods/type/list.htm";
    public static final String HOME_SHOW_POP = "/api/AssetAccount/queryNeedPopUp.html";
    public static final String GET_SUBSIDY_GOOD = "/app/restful_getSubsidyGoods.htm";
    public static final String SALE_AREA = "/uc/getActivityZone.htm";
    public static final String HOME_CARECARD_LIST = "/app/careCard/list.htm";//养修安行列表
    public static final String HOME_INVITATION = "/invitate/sumInvitation.html";//邀请好友
    public static final String UPDATE_NEED_POPUP = "/api/AssetAccount/updateNeedPopUp.html";
    public static final String HOME_SHOP_COLLECT = "/app/appLoginForAddCollect.htm";
    public static final String HOME_SHOP_CANCEL_COLLECT = "/app/deleteGoodsCollection.htm";
    public static final String HOME_ADD_CART = "/api/javamalls/shopCart/addCart.htm";

    public static final String SHOP_DETIL_NUMBER = "/queryCartGoodsCount.htm";

    public static final String HOME_SHOP_DETIL = "/mobile/appLogin.htm";
    public static final String H5_VIDEO_INTRODUCE = "http://8.u.h5mc.com/c/0azj/vudr/index.html";

    public static final String SHARE_INFO_FLOOR = "/app/restful_getShareFloorUrl.htm";
    public static final String SHARE_INFO_TREND_LIFE = "/app/trendLifeShare.htm";
    public static final String SHARE_INFO_SHOP_DETAIL = "/app/queryGoodsInfo4Share.htm";
    public static final String SHOP_AND_CART = "/app/restful_buyDataGoods.htm";
    //临时uuid
    public static String uuid = "2e9d356b-ee96-42f7-b6cd-a79c048fdc77";

    //me 我的页面
    public static final String ME_ADDRESS = "/api/javamalls/app/address/list.htm";//获取收货地址列表
    public static final String UPDATE_ADDRESS = "/api/javamalls/app/saveAddress.htm";
    public static final String DELETE_ADDRESS = "/api/javamalls/app/deleteAddress.htm";
    public static final String SAVE_ADDRESS = "/address/saveAddress.htm";
    public static final String ORDER_LIST = "/api/javamalls/app/orderList.htm";
    public static final String ORDER_DETAIL = "/api/javamalls/app/order_view.htm";
    public static final String ORDER_DELETE = "/api/javamalls/app/buyer/orderDelete.htm";
    public static final String ORDER_CANCEL = "/api/javamalls/app/orderCancel.htm";
    public static final String ORDER_CONFIRM = "/api/javamalls/app/buyer/orderCofirmSave.htm";
    public static final String ORDER_ALIPAY = "/api/javamalls/pay/aliPay.htm";

    public static final String ORDER_ALIPAY_RESULT = "/api/javamalls/pay/result.htm";

    public static final String ORDER_INVOICE_DETAIL = "/app/invoiceDetail.html";//发票信息

    public static final String ORDER_INVOICE_INFO = "/api/javamalls/order/getOrderInvoiceInfo.htm";//发票信息
    public static final String ORDER_INVOICE_DETAIL_INFO = "/api/javamalls/order/getOrderInvoiceDetailInfo.htm";//发票信息详情
    public static final String APPLY_RETURN = "/api/javamalls/app/buyer/orderReturnApply.htm";
    public static final String APPLY_SAVE = "/api/javamalls/app/buyer/orderReturnApplySave.htm";
    public static final String APPLY_SHIP = "/api/javamalls/app/buyer/orderReturnShip.htm";
    public static final String SAVE_SHIP = "/api/javamalls/app/buyer/orderReturnShipSave.htm";
    public static final String ORDER_RETURN_APPLY = "/api/javamalls/app/buyer/orderCancelList.htm";
    public static final String ORDER_CONTRACT_LIST = "/api/javamalls/app/contract/orderReturnContract.htm";
    public static final String ORDER_CONTRACT_4S = "/app/getContractDetail.html";
    public static final String NAME_AUTH = "/api/javamalls/validateUserInfo.htm";


    //智能
    public static final String DRIVE_SAFE_SHOP = "/app/order/getCarOrderInfo.htm";
    public static final String DRIVE_SAFE_FORS = "/app/getCarOrderInfoByUuid.html";
    public static final String DRIVE_SAFE_FUNCTION = "/app/order/serverPackage/getAll.htm";
    public static final String DRIVE_SAFE_FORS_FUNCTION = "/app/homepage/queryUserServiceListByFrameNo.html";
    public static final String DRIVE_SAFE_DEVICE = "/app/careCar/order/isOrderBindDevice.htm";
    public static final String DRIVE_MORE_SHOP = "/app/order/serverPackage/getAll.htm";
    public static final String DRIVE_MORE_FORS = "/app/getOrderServerPackages.html";
    public static final String DRIVE_MORE_DEFAULT_FORS = "/app/allServerPackage.html";
    public static final String DRIVE_SAFE_ORDER = "/app/api/score/getDrivingSafeHomePageByOrder.html";
    public static final String DRIVE_SAFE_OGET_USER_MONTHLY_REWARD_INFORDER_NEW = "/app/api/score/getDrivingSafeHomePageNew.html";
    public static final String DRIVE_SAFE_FUNCTION_RECHARGE = "/data/queryOrderList.html";
    public static final String DRIVE_UPLOAD_INIT = "/app/getCarLicenseByFrameNo.html";
    public static final String DRIVE_GET_CAR_LIST = "/app/getCarOrderInfoByUuid.html";
    public static final String DRIVE_GET_MY_SERVICES = "/app/homepage/MyService.html";
    public static final String GET_EVERY_MONTH_REWARD = "/api/point/getEveryMonthReward.html";
    public static final String GET_SHOP_EVERY_MONTH_REWARD = "/api/point/shop/getEveryMonthReward.html";
    public static final String GET_UPLOAD_DETAIL = "/app/getCarLicenseDetail.html";
    public static final String UPLOAD_PIC = "/app/driveLicenceUpload.html";
    public static final String GET_TRAVELTIMES = "api/grading/dfTravelTimesList";
    public static final String SAVE_MY_SERVICE = "/app/saveMyService.html";//保存我的应用
    public static final String GET_USER_MONTHLY_REWARD_INFO = "/api/point/getRewardContent.html";
    public static final String UPDATE_PROPAGANDA_STATUS = "/api/center/subsidyUnfreeze/updatePropagandaStatus.html";//更新安全宣传状态
    public static final String DRIVE_SAFE_ORDER_NEW = "/app/api/score/getDrivingSafeHomePageNew.html";


    public static final String DTB_DIRECTIONS = "DTB_directions/DTB_directions.html";

    //数据账户
    public static final String DRIVING_REPORT = "/week/report";//驾驶报告
    public static final String SEARCH_LABEL = "/week/searchLabel";//驾驶行为标签
    public static final String DATA_DETAIL = "/app/api/score/assets/detail.html";//数据详情接口
    public static final String DATA_ASSETS = "/app/api/score/getAssets.html";//数据资产账户首页

    //老版接口
    //    public static String LANDURL = "https://serverceshi.muheda.com";
//    public static String LANDURL = "https://serverceshi.muheda.com";//测试

    public static String VALIDATE = "/api/user/sms/validate";
    public static String VALIDATE_MOBILE = "/api/user/validateMobile";
    public static String SMS_SEND = "/api/user/sms/send";
    public static String FINDPWD = "/api/user/findPwd";
    public static String REGISTER = "/api/user/register";
    //    public static String LOGIN = "/login/doLogin.html";
    public static String LOGIN = "/api/user/doLogin";

}