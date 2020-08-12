package com.mengxin.community;

import org.junit.jupiter.api.Test;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author mx
 * @date 2020/5/6 - 23:14
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class QuartzTest {

    @Autowired
    private Scheduler scheduler;

    @Test
    public void testDeleteJob() {
        try {
            boolean flag = scheduler.deleteJob(new JobKey("alphaJob", "alphaJobGroup"));
            System.out.println(flag);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
