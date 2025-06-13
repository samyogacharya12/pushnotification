package com.example.pushnotificarion.controller;

import com.example.pushnotificarion.model.PushNotificationRequest;
import com.example.pushnotificarion.model.PushNotificationResponse;
import com.example.pushnotificarion.service.PushNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PushNotificationController {


    @Autowired
    private PushNotificationService pushNotificationService;


    @PostMapping("/notification/token")
    public ResponseEntity sendTokenNotification(@RequestBody PushNotificationRequest request) {
        pushNotificationService.sendPushNotificationToToken(request);
        System.out.println("princr");
        return new ResponseEntity<>(new PushNotificationResponse(HttpStatus.OK.value(), "Notification has been sent"), HttpStatus.OK);

    }

}
