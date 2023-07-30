package com.ntg.dependencyInjection.JavaBasedConfigurations;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigurattionAppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        MessageInterface messageGateway = context.getBean("smsServiceBean", MessageInterface.class);
        NotificationService n1 = context.getBean("notificationServiceBean", NotificationService.class);
//        n1.setMessageService(messageGateway);
        n1.notify("Ahmed");
    }
}
