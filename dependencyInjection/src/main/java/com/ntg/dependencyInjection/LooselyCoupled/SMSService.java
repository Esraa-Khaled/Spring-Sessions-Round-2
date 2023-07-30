package com.ntg.dependencyInjection.LooselyCoupled;

public class SMSService implements MessageInterface {

    @Override
    public void send(String userName) {
        System.out.println("Send sms to : " + userName);
    }

}
