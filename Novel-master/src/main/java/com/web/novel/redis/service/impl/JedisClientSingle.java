package com.web.novel.redis.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.web.novel.redis.service.JedisClient;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * redis单机版实现
 * @Author Administrator
 * @Date 2018年3月8日
 */
@Repository
public class JedisClientSingle implements JedisClient {
    @Resource
    private JedisPool jedisPool;

    @Override
    public String get(String key) {
        Jedis resource = jedisPool.getResource();
        String s = resource.get(key);
        resource.close();
        return s;
    }

    @Override
    public String set(String key, String value) {
        Jedis resource = jedisPool.getResource();
        String set = resource.set(key, value);
        resource.close();
        return set;
    }

    @Override
    public String hget(String hkey, String field) {
        Jedis resource = jedisPool.getResource();
        String hget = resource.hget(hkey, field);
        resource.close();
        return hget;
    }

    @Override
    public Long hset(String hkey, String field, String value) {
        Jedis resource = jedisPool.getResource();
        Long hset = resource.hset(hkey, field, value);
        resource.close();
        return hset;
    }

    @Override
    public Long incr(String key) {
        Jedis resource = jedisPool.getResource();
        Long incr = resource.incr(key);
        resource.close();
        return incr;
    }

    @Override
    public Long expire(String key, int sec) {
        Jedis resource = jedisPool.getResource();
        Long expire = resource.expire(key, sec);
        resource.close();
        return expire;
    }

    @Override
    public Long ttl(String key) {
        Jedis resource = jedisPool.getResource();
        Long ttl = resource.ttl(key);
        resource.close();
        return ttl;
    }

    @Override
    public Long del(String key) {
        Jedis resource = jedisPool.getResource();
        Long del = resource.del(key);
        resource.close();
        return del;
    }

    @Override
    public Long hdel(String hkey, String field) {
        Jedis resource = jedisPool.getResource();
        Long hdel = resource.hdel(hkey, field);
        resource.close();
        return hdel;
    }
}
