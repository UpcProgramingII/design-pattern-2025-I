package com.designPattern.factoryMethod.domains.factory;

import com.designPattern.factoryMethod.domains.Notification;
import com.designPattern.factoryMethod.domains.SMSNotification;

public class SmsFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
