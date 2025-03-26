package com.example.demo.controller;

import com.example.demo.service.NotificationService;
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
    public ResponseEntity<?> sendNotification(@RequestParam String type,
                                              @RequestParam String msg){
        String newMsg = service.senderNotification(type, msg);
        return ResponseEntity.ok(newMsg);

    }

}
