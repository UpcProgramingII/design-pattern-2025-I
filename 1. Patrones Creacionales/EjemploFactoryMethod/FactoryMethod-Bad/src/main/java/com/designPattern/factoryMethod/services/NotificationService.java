package com.designPattern.factoryMethod.services;

import com.designPattern.factoryMethod.domains.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private Notification notification;

    public NotificationService(){
    }

    public String sendNotification(String type, String msg){

        if(type.equals("sms")){
            notification = new SMSNotification();

        } else if (type.equals("push")) {
            notification = new PushNotification();

        } else  {
            notification = new EmailNotification();

        }
        return notification.send(msg);
    }

}
