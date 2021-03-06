package me.kalpha.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class SampleController {
    @Value("${greetings}")
    private String greetings;

    @GetMapping("/greetings")
    public String saygreetings() {
        return greetings;
    }
}
