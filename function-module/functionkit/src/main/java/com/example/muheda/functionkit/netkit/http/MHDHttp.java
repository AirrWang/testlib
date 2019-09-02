package com.example.muheda.functionkit.netkit.http;

import android.text.TextUtils;

import com.example.muheda.functionkit.netkit.constant.StateConstant;
import com.example.muheda.functionkit.netkit.model.ModelDto;
import com.example.muheda.functionkit.netkit.model.OriginalResultDto;
import com.example.muheda.functionkit.netkit.params.BaseParams;
import com.example.muheda.functionkit.netkit.params.HttpNewParams;
import com.zhouyou.http.callback.SimpleCallBack;
import com.zhouyou.http.exception.ApiException;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Field;

import io.reactivex.disposables.Disposable;

/**
 * Created by 13660 on 2018/10/19.
 */

public class MHDHttp {
    public static String[] params = new String[]{"baseParams", "url", "modelClass", "isAuto", "mRules"};

    /**
     * @param strBaseParams 参数判断实体
     * @param strUrl        url
     * @param strClass      Model Class
     * @param strboolean    是否zi动解析Json true自动解
     *                      反射根据字段字符串 获取变量值
     */
    public static void setParamsArray(String strBaseParams, String strUrl, String strClass, String strboolean, String rules) {
        params[0] = strBaseParams;
        params[1] = strUrl;
        params[2] = strClass;
        params[3] = strboolean;
        params[4] = rules;
    }


    /**
     * @param enumR      操作实体 包含参数校验实体 数据实体 等
     * @param httpParams 请求体
     * @param callBack   回调
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R extends Enum> Disposable post(final R enumR, final HttpNewParams httpParams, final OnNewListener<T> callBack) {


        try {
            if (getObject(enumR, params[0]) != null) {
                if (!(((BaseParams) getObject(enumR, params[0])).getHttpNewParams(httpParams))) {
                    return null;
                }
            }
            return method("post", (String) getObject(enumR, params[1]), httpParams, callBack, new SimpleCallBack<String>() {
                @Override
                public void onError(ApiException e) {
                    callBack.onErrorOrExpection();
                }

                @Override
                public void onSuccess(String string) {
                    try {
                        Class mClass = null;
                        if (getObject(enumR, params[2]) != null) {
                            mClass = (Class) getObject(enumR, params[2]);
                        }
                        getModel(string, mClass, (boolean) getObject(enumR, params[3]), callBack, enumR);
                    } catch (Exception e) {
                        e.printStackTrace();
                        callBack.onErrorOrExpection();
                    }

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T, R extends Enum> Disposable get(final R enumR, final HttpNewParams httpParams, final OnNewListener<T> callBack) {


        try {
            if (getObject(enumR, params[0]) != null) {
                if (!(((BaseParams) getObject(enumR, params[0])).getHttpNewParams(httpParams))) {
                    return null;
                }
            }
            return method("get", (String) getObject(enumR, params[1]), httpParams, callBack, new SimpleCallBack<String>() {
                @Override
                public void onError(ApiException e) {
                    callBack.onErrorOrExpection();
                }

                @Override
                public void onSuccess(String string) {
                    try {
                        Class mClass = null;
                        if (getObject(enumR, params[2]) != null) {
                            mClass = (Class) getObject(enumR, params[2]);
                        }
                        getModel(string, mClass, (boolean) getObject(enumR, params[3]), callBack, enumR);
                    } catch (Exception e) {
                        e.printStackTrace();

                        callBack.onErrorOrExpection();
                    }

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    /**
     * 获取变量值
     *
     * @param enumR     枚举类
     * @param strParams 变量key
     * @param <R>
     * @return
     * @throws Exception
     */
    public static <R extends Enum> Object getObject(final R enumR, String strParams) throws Exception {
        Class enumClass = enumR.getClass();
        Field field = enumClass.getDeclaredField(strParams);
        field.setAccessible(true);
        return field.get(enumR);
    }

    /**
     * 网络请求方式
     *
     * @param method         post get
     * @param url            url
     * @param httpParams     请求实体
     * @param callBack
     * @param simpleCallback
     * @param <T>
     * @return
     */
    public static <T> Disposable method(String method, String url, final HttpNewParams httpParams, final OnNewListener<T> callBack, SimpleCallBack<String> simpleCallback) {
        Disposable disposable = null;
        switch (method) {
            case "post":
                disposable = HttpUtil.post(url, httpParams, simpleCallback);
                break;
            case "get":
                disposable = HttpUtil.get(url, httpParams, simpleCallback);
                break;
        }
        return disposable;
    }

    /**
     * 判断model 处理方式
     *
     * @param response
     * @param aClass
     * @param is
     * @param callBack
     * @param <T>
     * @throws JSONException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static <T, R extends Enum> void getModel(String response, Class aClass, boolean is, final OnNewListener<T> callBack, R enumR) throws JSONException, IllegalAccessException, InstantiationException {
        JSONObject jsonObject = new JSONObject(response);
        //jsonObject.optString("data").equals("[]");
        String code = jsonObject.optString("code");
        Object data = jsonObject.opt("data");
        //若 code或data不全有 创建class继承ModelDto解析数据 则OnSuccess之外失效
        String resultCode = jsonObject.optString("resultCode");
        String message = jsonObject.optString("message");

        try {
            Class rulesClass = (Class) getObject(enumR, params[4]);
            if (rulesClass != null) {
                ProcessingRules rule = (ProcessingRules) rulesClass.newInstance();
                OriginalResultDto<T> resultDto = new OriginalResultDto(response, code, message, callBack);
                int requestType = rule.processingRules(resultDto);
                if (requestType == OriginalResultDto.NET_SUCCESS) {
                    ModelDto modelDto = (ModelDto) aClass.newInstance();
                    callBack.onSuccess((T) modelDto.toJson(response, is));
                } else if (requestType == OriginalResultDto.NET_NULL) {
                    callBack.onNull(resultDto.getCode(), resultDto.getMessage());
                }
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (!TextUtils.isEmpty(resultCode) && TextUtils.isEmpty(message) && data == null) {
            callBack.onSuccess((T) response);
            return;
        }

        //临时购物车和立即购买

        if (TextUtils.isEmpty(code) || data == null) {
            ModelDto modelDto = (ModelDto) aClass.newInstance();
            callBack.onSuccess((T) modelDto.toJson(response, is));
            return;
        }

        if (StateConstant.REQUEST_CODE_200.equals(jsonObject.getString("code"))) {
            if (aClass == null) {
                callBack.onSuccess((T) response);
                return;
            }

            int dataInt = jsonObject.optInt("data", Integer.MIN_VALUE);
            if (dataInt != Integer.MIN_VALUE) {
                ModelDto modelDto = (ModelDto) aClass.newInstance();
                callBack.onSuccess((T) modelDto.toJson(response, is));
                return;
            }

            if (jsonObject.optString("data").length() < StateConstant.REQUEST_LENG_5) {
                callBack.onNull(jsonObject.getString("code"), jsonObject.getString("message"));
                return;
            }
            ModelDto modelDto = (ModelDto) aClass.newInstance();
            callBack.onSuccess((T) modelDto.toJson(response, is));
            return;
        }
        callBack.onOtherState(jsonObject.getString("code"), jsonObject.getString("message"));
    }
}
