package me.kalpha.mybiz;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@CommonsLog
@Configuration
@EnableBatchProcessing
public class MyBatchConfig {
    @Autowired
    JobBuilderFactory jobBuilderFactory;
    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step stepOne () {
        return stepBuilderFactory.get("stepOne")
                .tasklet(new MyOneTasklet())
                .build();
    }

    @Bean
    public Step stepTwo() {
        return stepBuilderFactory.get("stepTwo")
                .tasklet(new MyTwoTasklet())
                .build();
    }

    @Bean(name = "jobOnetwo")
    public Job jobOnetwo() {
        return jobBuilderFactory.get("jobOnetwo")
                .start(stepOne())
                .next(stepTwo())
                .build();
    }

    @Bean(name = "jobOne")
    public Job jobOne() {
        return jobBuilderFactory.get("jobOne")
                .flow(stepOne())
                .build()
                .build();
    }
}
