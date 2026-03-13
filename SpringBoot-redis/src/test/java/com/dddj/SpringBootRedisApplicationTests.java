package com.dddj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringBootRedisApplicationTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testSet() {
        redisTemplate.opsForValue().set("name","张三");

    }
    @Test
    public void testGet() {
        // 获取
        String name = (String) redisTemplate.opsForValue().get("name");
        System.out.println(name);

    }
}
