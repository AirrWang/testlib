package com.example.muheda.mhdsystemkit.sytemUtil.functionutil;

import java.util.List;

/**
 * @author zhangming
 * @Date 2019/5/20 9:53
 * @Description: 集合的工具类
 */
public class CollectionUtil {

    public static boolean isEmpty(List list) {
        return list == null || list.size() == 0;
    }

}
