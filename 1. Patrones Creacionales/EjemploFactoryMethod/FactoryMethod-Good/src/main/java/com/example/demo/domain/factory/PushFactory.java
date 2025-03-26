package com.example.demo.domain.factory;

import com.example.demo.domain.EmailNotification;
import com.example.demo.domain.Notification;
import com.example.demo.domain.PushNotification;

public class PushFactory extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
