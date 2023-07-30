package com.ntg.dependencyInjection.LooselyCoupled;


public class LosselyCoupledAppMain {

    public static void main(String[] args) {
        MessageInterface messageGateway = new SMSService();
        NotificationService n1 = new NotificationService();
        n1.setMessageService(messageGateway);
        n1.notify("Ahmed");
    }
}
