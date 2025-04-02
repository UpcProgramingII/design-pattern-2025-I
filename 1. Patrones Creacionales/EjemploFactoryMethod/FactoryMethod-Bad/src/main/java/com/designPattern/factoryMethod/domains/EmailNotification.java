package com.designPattern.factoryMethod.domains;

public class EmailNotification implements Notification {
    @Override
    public String send(String message) {

        return("Enviando notificación por Email: " + message);
    }
}