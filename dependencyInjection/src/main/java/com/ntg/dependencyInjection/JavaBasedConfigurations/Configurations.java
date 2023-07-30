package com.ntg.dependencyInjection.JavaBasedConfigurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {

    @Bean(name = "emailBean")
    public MessageInterface emailServiceBean() {
        return new EmailService();
    }

    @Bean
    public MessageInterface smsServiceBean() {
        return new SMSService();
    }

    @Bean
    public NotificationService notificationServiceBean() {
        return new NotificationService(smsServiceBean());
    }
}
