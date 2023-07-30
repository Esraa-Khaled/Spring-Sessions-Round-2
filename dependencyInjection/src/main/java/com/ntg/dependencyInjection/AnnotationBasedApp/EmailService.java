package com.ntg.dependencyInjection.AnnotationBasedApp;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageInterface {

    @Override
    public void send(String userName) {
        System.out.println("Send email to : " + userName);
    }
}
