package com.bisht.example.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.bisht.example.model.Chat;

@Controller
public class ChatController {

	@MessageMapping("/chat")
	@SendTo("/topic/chat")
	public Chat greeting(@Payload Chat chat) {
		if (chat == null || chat.getMessage() == null || chat.getUser() == null) {
			throw new IllegalArgumentException("Invalid chat data received");
		}
		return chat;
	}

}
