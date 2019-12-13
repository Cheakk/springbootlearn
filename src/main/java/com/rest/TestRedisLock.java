package com.rest;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/redislock")
public class TestRedisLock {
    
    @Autowired
    private Redisson redisson;
    
    @GetMapping
    @ResponseBody
    public String getlock() {
        RLock lock = redisson.getLock("anyLock");
        // Most familiar locking method
        lock.lock();
        return null;
    }
    
}
