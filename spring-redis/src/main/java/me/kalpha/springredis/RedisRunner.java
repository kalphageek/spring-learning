package me.kalpha.springredis;

import me.kalpha.springredis.member.Team;
import me.kalpha.springredis.member.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RedisRunner implements ApplicationRunner {
    @Autowired
    StringRedisTemplate redisTemplate;
    @Autowired
    TeamRepository teamRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        ValueOperations<String, String> values = redisTemplate.opsForValue();
        values.set("hello2", "world2");

        Team team = new Team();
        team.setName("Cloud");
        teamRepository.save(team);
        Optional<Team> byId = teamRepository.findById(team.getId());
        System.out.println(byId.get().getId());
        System.out.println(byId.get().getName());
    }
}
