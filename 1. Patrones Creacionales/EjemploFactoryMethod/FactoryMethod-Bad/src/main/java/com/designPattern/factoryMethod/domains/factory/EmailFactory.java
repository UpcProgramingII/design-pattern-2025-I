package com.designPattern.factoryMethod.domains.factory;

import com.designPattern.factoryMethod.domains.EmailNotification;
import com.designPattern.factoryMethod.domains.Notification;

public class EmailFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
