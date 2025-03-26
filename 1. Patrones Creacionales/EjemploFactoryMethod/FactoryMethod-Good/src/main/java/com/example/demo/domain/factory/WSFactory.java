package com.example.demo.domain.factory;

import com.example.demo.domain.EmailNotification;
import com.example.demo.domain.Notification;
import com.example.demo.domain.WSNotification;

public class WSFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new WSNotification();
    }
}
