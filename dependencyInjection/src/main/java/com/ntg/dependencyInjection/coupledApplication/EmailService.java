package com.ntg.dependencyInjection.coupledApplication;

public class EmailService {

    public void send(String userName) {
        System.out.println("Send email to : " + userName);
    }

}
