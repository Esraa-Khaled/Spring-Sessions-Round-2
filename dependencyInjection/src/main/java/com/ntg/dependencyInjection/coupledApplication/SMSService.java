package com.ntg.dependencyInjection.coupledApplication;

public class SMSService {

    public void send(String userName) {
        System.out.println("Send sms to : " + userName);
    }

}
