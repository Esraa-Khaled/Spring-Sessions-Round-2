package com.ntg.dependencyInjection.LooselyCoupled;

public class EmailService implements MessageInterface {

    @Override
    public void send(String userName) {
        System.out.println("Send email to : " + userName);
    }
}
