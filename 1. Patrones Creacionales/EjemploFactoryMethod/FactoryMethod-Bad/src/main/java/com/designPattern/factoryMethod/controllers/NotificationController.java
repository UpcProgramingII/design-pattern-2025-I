package com.designPattern.factoryMethod.controllers;

import com.designPattern.factoryMethod.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private NotificationService service;

    @GetMapping("/send")
    public ResponseEntity<?> sendNotification(@RequestParam String type, @RequestParam String msg){

        return ResponseEntity.ok(service.sendNotification(type, msg));

    }

}
