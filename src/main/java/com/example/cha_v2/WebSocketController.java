package com.example.cha_v2;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/send/message")
    @SendTo("/topic/receive/message")
    public String receiveMessage(String message) {
        return "You sent: " + message;
    }
}

