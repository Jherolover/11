package com.elite.App.config;

import com.elite.App.util.MessageUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1. 配置类中配置bean
 * 2.在xml中配置bean
 * 3.使用注解配置bean
 */
@Configuration
public class DefaultConfig {

    @Bean(name = "messageutil")
    public MessageUtil messageUtil(){
        return new MessageUtil();
    }
}
