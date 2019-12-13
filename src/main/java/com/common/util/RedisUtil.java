package com.common.util;

import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;

public class RedisUtil {

    private Config config;

    @Value(value = "spring.redis.database")
    private String database;
    @Value(value = "spring.redis.host")
    private String host;
    @Value(value = "spring.redis.port")
    private String port;
    @Value(value = "spring.redis.pool.max-active")
    private String active;
    @Value(value = "spring.redis.password")
    private String pwd;
    @Value(value = "spring.redis.pool.max-wait")
    private String wait;
    @Value(value = "spring.redis.pool.max-idle")
    private String MaxIdle;
    @Value(value = "spring.redis.pool.min-idle")
    private String MinIdle;

    public RedisUtil(Config config) {
        this.config = new Config();
    }
}
