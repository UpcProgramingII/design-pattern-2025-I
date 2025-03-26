package com.example.demo.domain;

public class WSNotification implements Notification{

    @Override
    public String send(String msg) {
        return "Notificacion enviada por WhatsApp: " + msg;
    }
}
