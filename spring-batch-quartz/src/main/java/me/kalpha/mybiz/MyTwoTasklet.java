package me.kalpha.mybiz;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

@CommonsLog
public class MyTwoTasklet implements Tasklet {
    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        log.info("MyTwoTasklet start ...");

        log.info("MyTwoTasklet done ...");
        return RepeatStatus.FINISHED;
    }
}
