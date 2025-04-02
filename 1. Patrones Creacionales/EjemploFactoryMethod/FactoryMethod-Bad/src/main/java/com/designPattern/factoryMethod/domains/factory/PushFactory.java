package com.designPattern.factoryMethod.domains.factory;

import com.designPattern.factoryMethod.domains.*;

public class PushFactory extends NotificationFactory{
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
