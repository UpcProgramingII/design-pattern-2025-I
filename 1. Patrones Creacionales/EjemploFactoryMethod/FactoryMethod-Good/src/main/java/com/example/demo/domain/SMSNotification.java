package com.example.demo.domain;

public class SMSNotification implements Notification{
    @Override
    public String send(String msg) {
        return "Notificacion enviada por SMS: " + msg;
    }
}
