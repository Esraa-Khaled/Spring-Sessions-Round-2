package com.ntg.dependencyInjection.coupledApplication;

public class NotificationService {

    public void notify(String userName) {
        EmailService e1 = new EmailService();
        SMSService s1 = new SMSService();
        s1.send(userName);
    }
}
