package com.baeldung;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.baeldung.spring.kafka.KafkaApplication;

@SpringBootTest(classes = KafkaApplication.class)
public class SpringContextManualTest {

    @Test
    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
    }
}
