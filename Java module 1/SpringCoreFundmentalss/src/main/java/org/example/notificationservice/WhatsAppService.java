package org.example.notificationservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



public class WhatsAppService implements NotificationService {
    @Override
    public void sendMsg(String msg){
        System.out.println("Whatsapp Service " + msg);
    }
}
