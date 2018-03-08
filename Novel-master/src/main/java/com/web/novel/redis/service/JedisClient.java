package com.web.novel.redis.service;

/**
 * jedisClient操作
 * @Author Administrator
 * @Date 2018年3月8日
 */
public interface JedisClient {
	/**
	 * 获取String类型的值
	 * @param key
	 * @return
	 */
    String get(String key);
    
    /**
     * 设置一个String类型的键值对
     * @param key
     * @param value
     * @return
     */
    String set(String key, String value);
    
    /**
     * 获取一个hash类型的值的字段值
     * @param hkey 键值对的key
     * @param field 键值对的value的字段名称
     * @return
     */
    String hget(String hkey, String field);

    /**
     * 设置一个hash类型的值
     * @param hkey 键值对的key
     * @param field 键值对的value的字段名称
     * @param value 键值对value的值
     * @return
     */
    Long hset(String hkey, String field, String value);

    /**
     * 原子操作,给String类型的值加一
     * @param key
     * @return
     */
    Long incr(String key);

    /**
     * 给String类型的键值对设置过期时间
     * @param key 键值对的key
     * @param sec 秒为单位的过期时间
     * @return
     */
    Long expire(String key, int sec);

    /**
     * 键值对的剩余生存时间
     * @param key
     * @return
     */
    Long ttl(String key);
    
    /**
     * 
     * @param key
     * @return
     */
    Long del(String key);

    /**
     * 
     * @param hkey
     * @param field
     * @return
     */
    Long hdel(String hkey, String field);
}