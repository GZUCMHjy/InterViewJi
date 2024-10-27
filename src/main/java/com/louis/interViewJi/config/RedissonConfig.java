package com.louis.interViewJi.config;

import lombok.Data;
import org.redisson.Redisson;

import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author louis
 * @version 1.0
 * @date 2024/10/27 9:06
 * 客户端 Redisson 读取配置
 */
@Configuration
@ConfigurationProperties(prefix = "spring.redis")
@Data
public class RedissonConfig {
    private Integer port;
    private String host;
    private Integer database;
    private String password;

    // 加载到 Spring 中的 bean 容器
    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer()
//                .setConnectTimeout(timeout) // 未设置使用默认
                .setAddress("redis://127.0.0.1:6379")
                .setDatabase(1); // 未设置使用默认
//                .setPassword(redisProperties.getPassword()); // 未设置使用默认
        return Redisson.create(config);
    }

}
