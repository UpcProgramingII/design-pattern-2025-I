package com.designPattern.factoryMethod.domains;

public class PushNotification implements Notification {
    @Override
    public String send(String message) {
        return("Enviando notificación Push: " + message);
    }
}
