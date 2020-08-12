package com.mengxin.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author mx
 * @date 2020/5/6 - 22:16
 */

@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {

}
