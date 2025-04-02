package com.designPattern.factoryMethod.services;

import com.designPattern.factoryMethod.domains.*;
import com.designPattern.factoryMethod.domains.factory.EmailFactory;
import com.designPattern.factoryMethod.domains.factory.NotificationFactory;
import com.designPattern.factoryMethod.domains.factory.PushFactory;
import com.designPattern.factoryMethod.domains.factory.SmsFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private NotificationFactory notificationFactory;

    public NotificationService(){
    }

    public String sendNotification(String type, String msg){

        this.configureFactoryNotification(type);
        Notification notification = notificationFactory.getNotification();
        return notification.send(msg);
    }

    private void configureFactoryNotification(String type){

        if(type.equals("sms")){
            notificationFactory = new SmsFactory();

        } else if (type.equals("push")) {
            notificationFactory = new PushFactory();

        } else  {
            notificationFactory = new EmailFactory();

        }
    }

}
