package com.example.demo.service;

import com.example.demo.domain.EmailNotification;
import com.example.demo.domain.Notification;
import com.example.demo.domain.PushNotification;
import com.example.demo.domain.SMSNotification;
import com.example.demo.domain.factory.*;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private NotificationFactory notificationFactory;

    public NotificationService(){}

    public String senderNotification(String type, String msg){
        configurationFactory(type);
        Notification notification = notificationFactory.getNotification();
        return notification.send(msg);
    }

    private void configurationFactory(String type){
        if(type.equals("push")){
            notificationFactory = new PushFactory();
        } else if (type.equals("sms")) {
            notificationFactory = new SMSFactory();
        }else if(type.equals("ws")){
            notificationFactory = new WSFactory();
        }else{
            notificationFactory = new EmailFactory();
        }

    }

}
