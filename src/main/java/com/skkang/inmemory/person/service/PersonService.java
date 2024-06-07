package com.skkang.inmemory.person.service;

import com.skkang.inmemory.common.service.RedisService;
import com.skkang.inmemory.person.dto.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final RedisTemplate<String, Object> redisTemplate;

    public void create(Person person) {
        redisTemplate.opsForValue().set(person.getId(), person);
        redisTemplate.expire(person.getId(), 60, TimeUnit.SECONDS);
    }


}
