package com.ntg.dependencyInjection.AnnotationBasedApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    @Autowired
    private MessageInterface messageService;

    public NotificationService() {}

    //constructor Injection
    //@Autowired
    public NotificationService(MessageInterface messageService) {
        this.messageService = messageService;
    }

    public void notify(String userName) {
        messageService.send(userName);
    }

//    @Autowired
    public void setMessageService(MessageInterface messageService) {
        this.messageService = messageService;
    }
}
