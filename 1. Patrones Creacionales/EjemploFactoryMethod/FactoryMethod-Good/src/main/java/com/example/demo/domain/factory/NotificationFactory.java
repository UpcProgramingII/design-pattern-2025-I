package com.example.demo.domain.factory;

import com.example.demo.domain.Notification;

public abstract class NotificationFactory {

    public Notification getNotification(){

        Notification notification = createNotification();
        return  notification;

    }

    public abstract Notification createNotification();

}
