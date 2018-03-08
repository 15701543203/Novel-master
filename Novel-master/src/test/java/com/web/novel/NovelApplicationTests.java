package com.web.novel;

import java.io.IOException;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.web.novel.dao.EnglishChapterMapper;
import com.web.novel.redis.service.impl.JedisClientCluster;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=NovelApplication.class)
public class NovelApplicationTests {

	@Autowired
	EnglishChapterMapper eChapterMapper;
	
	@Test
	public void getEnglishChapter(){
		int a = eChapterMapper.selectTotalChapters(2);
		System.err.println(a);
	}
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Test
	public void test() throws Exception {
		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
	}
	
	@Test
	public void testCluster() throws Exception{
		HashSet<HostAndPort> nodes = new HashSet<>();
		nodes.add(new HostAndPort("192.168.10.11", 7001));
		nodes.add(new HostAndPort("192.168.10.11", 7002));
		nodes.add(new HostAndPort("192.168.10.11", 7003));
		nodes.add(new HostAndPort("192.168.10.11", 7004));
		nodes.add(new HostAndPort("192.168.10.11", 7005));
		nodes.add(new HostAndPort("192.168.10.11", 7006));
		
		JedisCluster cluster = new JedisCluster(nodes);
		
		cluster.set("key1", "1000");
		String string = cluster.get("key1");
		System.out.println(string);
		
		cluster.close();
	}
	
	
	@Test
	public void testJedisSingle() {
		// 创建一个jedis的对象。
		Jedis jedis = new Jedis("192.168.10.11", 6379);
		// 调用jedis对象的方法，方法名称和redis的命令一致。
		jedis.set("key1", "jedis test");
		String string = jedis.get("key1");
		System.out.println(string);
		// 关闭jedis。
		jedis.close();
	}
	
	
	@Test
	public void testJedisPool() {
		// 创建jedis连接池
		JedisPool pool = new JedisPool("192.168.10.11", 6379);
		// 从连接池中获得Jedis对象
		Jedis jedis = pool.getResource();
		String string = jedis.get("keya");
		System.out.println(string);
		// 关闭jedis对象
		jedis.close();
		pool.close();
	}
	
	
}
 