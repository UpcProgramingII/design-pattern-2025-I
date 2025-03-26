package com.example.demo.domain.factory;

import com.example.demo.domain.EmailNotification;
import com.example.demo.domain.Notification;

public class EmailFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
