package com.ntg.dependencyInjection.AnnotationBasedApp;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageInterface {

    @Override
    public void send(String userName) {
        System.out.println("Send sms to : " + userName);
    }

}
