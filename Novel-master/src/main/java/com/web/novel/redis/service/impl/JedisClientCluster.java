package com.web.novel.redis.service.impl;

import javax.annotation.Resource;

import com.web.novel.redis.service.JedisClient;

import redis.clients.jedis.JedisCluster;

/**
 * redisCluster客户端
 * @Author Administrator
 * @Date 2018年3月8日
 */
 
public class JedisClientCluster implements JedisClient {
    /**
     * 引入RedisConfig中的 jedisCluster Bean
     */
    @Resource
    private JedisCluster jedisCluster;

    @Override
    public String get(String key) {
        return jedisCluster.get(key);
    }

    @Override
    public String set(String key, String value) {
        return jedisCluster.set(key, value);
    }

    @Override
    public String hget(String hkey, String field) {
        return jedisCluster.hget(hkey, field);
    }

    @Override
    public Long hset(String hkey, String field, String value) {
        return jedisCluster.hset(hkey, field, value);
    }

    @Override
    public Long incr(String key) {
        return jedisCluster.incr(key);
    }

    @Override
    public Long expire(String key, int sec) {
        return jedisCluster.expire(key, sec);
    }

    @Override
    public Long ttl(String key) {
        return jedisCluster.ttl(key);
    }

    @Override
    public Long del(String key) {
        return jedisCluster.del(key);
    }

    @Override
    public Long hdel(String hkey, String field) {
        return jedisCluster.hdel(hkey, field);
    }
}