package com.ntg.dependencyInjection.JavaBasedConfigurations;

public class SMSService implements MessageInterface {

    @Override
    public void send(String userName) {
        System.out.println("Send sms to : " + userName);
    }

}
