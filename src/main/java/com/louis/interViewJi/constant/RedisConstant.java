package com.louis.interViewJi.constant;

/**
 * @author louis
 * @version 1.0
 * @date 2024/10/27 9:14
 */
public interface RedisConstant {
    String USER_SIGN_IN_REDIS_KEY_PREFIX = "user:signins";
    // 动态参数拼接前缀
    static String getUserSigninsRedisKey(int year,long userId){
        return String.format("%s:%s:%s",USER_SIGN_IN_REDIS_KEY_PREFIX,year,userId);
    }
}
