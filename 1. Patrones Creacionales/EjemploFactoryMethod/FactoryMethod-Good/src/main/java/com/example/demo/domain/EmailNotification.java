package com.example.demo.domain;

public class EmailNotification implements Notification{
    @Override
    public String send(String msg) {
        return "Notificacion enviada por Email: " + msg;
    }
}
