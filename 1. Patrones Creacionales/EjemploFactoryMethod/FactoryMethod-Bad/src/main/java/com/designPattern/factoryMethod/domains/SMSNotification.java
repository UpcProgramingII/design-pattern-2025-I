package com.designPattern.factoryMethod.domains;

public class SMSNotification implements Notification {
    @Override
    public String send(String message) {
        return("Enviando notificación por SMS: " + message);
    }
}
