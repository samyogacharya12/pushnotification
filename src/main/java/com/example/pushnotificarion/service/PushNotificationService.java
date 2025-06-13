package com.example.pushnotificarion.service;

import com.example.pushnotificarion.model.PushNotificationRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PushNotificationService {

    private Logger logger = LoggerFactory.getLogger(PushNotificationService.class);


    @Autowired
    private FireBaseService fireBaseService;


    public void sendPushNotificationToToken(PushNotificationRequest pushNotificationRequest) {
        try {
            fireBaseService.sendMessageToToken(pushNotificationRequest);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

}
