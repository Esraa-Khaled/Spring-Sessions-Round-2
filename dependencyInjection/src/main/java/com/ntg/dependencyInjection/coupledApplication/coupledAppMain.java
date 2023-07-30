package com.ntg.dependencyInjection.coupledApplication;

public class coupledAppMain {

    public static void main(String[] args) {
        NotificationService n1 = new NotificationService();
        n1.notify("Ahmed");
    }
}
