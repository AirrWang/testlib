package com.example.muheda.functionkit.netkit.params;

/**
 * Created by 13660 on 2018/11/14.
 */

public class HttpParamsUtil {
    public static HttpNewParams getCommonRequestParams(Object[][] value){
        HttpNewParams params = new HttpNewParams();
        for (Object[] objectValue:value){
            if (objectValue[1] instanceof String) {
                params.put((String)(objectValue[0]), ((String)objectValue[1]));
            }
            if (objectValue[1] instanceof Boolean) {
                params.put((String)(objectValue[0]), String.valueOf(((boolean)objectValue[1])));
            }
            if (objectValue[1] instanceof Integer) {
                params.put((String)(objectValue[0]), String.valueOf(((int)objectValue[1])));
            }
            if (objectValue[1] instanceof Float) {
                params.put((String)(objectValue[0]), String.valueOf(((float)objectValue[1])));
            }
            if (objectValue[1] instanceof Double) {
                params.put((String)(objectValue[0]), String.valueOf(((double)objectValue[1])));
            }
        }
        return params;
    }
}
