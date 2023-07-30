package com.ntg.dependencyInjection.AnnotationBasedApp;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBasedAppMain {

    public static void main(String[] args) {
        //ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);
        //
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();
        context1.register(Configurations.class);
        context1.refresh();
        NotificationService n1 = context1.getBean("notificationService", NotificationService.class);
        n1.notify("Test User");

    }

}
