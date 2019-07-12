package com.xd.concurrency.example.cache;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author LitheLight
 * @date 2019/7/12
 */
@Configuration
public class RedisConfig {

    @Bean(name = "redisPool")
    public JedisPool jedisPool(@Value("${redis.host}") String host,
                               @Value("${redis.port}") int port, @Value("${redis.password}") String password) {
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(100);
        poolConfig.setMaxTotal(1000);
        poolConfig.setMaxWaitMillis(500 * 1000);
        return new JedisPool(poolConfig, host, port, 500 * 1000, password);
    }
}
