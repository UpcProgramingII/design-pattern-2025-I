package com.designPattern.factoryMethod.domains.factory;

import com.designPattern.factoryMethod.domains.Notification;

public abstract class NotificationFactory {

    public abstract Notification createNotification();

    public Notification getNotification(){

        Notification notification;
        notification = this.createNotification();
        return notification;

    }

}
