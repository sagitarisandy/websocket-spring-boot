package com.example.demo.controller;

import com.example.demo.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    @MessageMapping("/chat.sendMessage") // pesan dari client ke server
    @SendTo("/topic/public") // broadcast ke semua client
    public ChatMessage sendMessage(ChatMessage message) {
        return message;// langsung kirim balik ke semua
    }
}
