package com.bisht.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.bisht.example.model.Chat;

@Controller
public class ChatController {
	
	private static final Logger logger = LoggerFactory.getLogger(ChatController.class);


	@MessageMapping("/chat")
	@SendTo("/topic/chat")
	public Chat greeting(@Payload Chat chat) {
		if (chat == null || chat.getMessage() == null || chat.getUser() == null) {
			logger.error("Invalid chat data received");
			throw new IllegalArgumentException("Invalid chat data received");
		}
        logger.info("Received chat message from {}: {}", chat.getUser(), chat.getMessage());
		return chat;
	}

}
