package me.kalpha.task1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class Task1Config {
    private final JobBuilderFactory jobBuilderFactory;
    private final StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job task1Job() {
        return jobBuilderFactory.get("task1Job")
                .start(task1Step(null))
                .build();
    }

    @Bean
    @JobScope
    public Step task1Step(@Value("#{jobParameters[requestDate]}") String requestDate) {
        return stepBuilderFactory.get("task1Step")
                .tasklet(((stepContribution, chunkContext) -> {
                    log.info(">>>>>> This is Task1 Step");
                    log.info(">>>>>> requestDate = {}", requestDate);
                    return RepeatStatus.FINISHED;
                }))
                .build();
    }
}
