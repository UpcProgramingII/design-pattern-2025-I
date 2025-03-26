package com.example.demo.domain;

public class PushNotification implements Notification{
    @Override
    public String send(String msg) {
        return "Notificacion enviada por Push: " + msg;
    }
}
