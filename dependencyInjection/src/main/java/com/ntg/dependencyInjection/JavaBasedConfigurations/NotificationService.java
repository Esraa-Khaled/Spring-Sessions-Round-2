package com.ntg.dependencyInjection.JavaBasedConfigurations;

public class NotificationService {

    private MessageInterface messageService;

    public NotificationService() {}

    //constructor Injection
    public NotificationService(MessageInterface messageService) {
        this.messageService = messageService;
    }

    public void notify(String userName) {
        messageService.send(userName);
    }

    public void setMessageService(MessageInterface messageService) {
        this.messageService = messageService;
    }
}
