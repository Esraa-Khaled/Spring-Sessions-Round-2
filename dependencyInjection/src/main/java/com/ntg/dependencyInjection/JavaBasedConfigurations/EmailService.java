package com.ntg.dependencyInjection.JavaBasedConfigurations;

public class EmailService implements MessageInterface {

    @Override
    public void send(String userName) {
        System.out.println("Send email to : " + userName);
    }
}
