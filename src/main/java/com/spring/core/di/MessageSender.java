package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

//    private SMSService smsService;
//
//    public MessageSender(SMSService smsService) {
//        this.smsService = smsService;
//    }
//
//    public void sendMessage(String message) {
//        this.smsService.sendMessage(message);
//    }

    private MessageService messageService;

    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService) {

        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        this.messageService.sendMessage(message);
    }
}
