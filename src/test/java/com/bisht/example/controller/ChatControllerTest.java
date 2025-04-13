package com.bisht.example.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.bisht.example.model.Chat;

public class ChatControllerTest {
	
	 @Test
	    void testGreeting() {
	        ChatController chatController = new ChatController();
	        Chat chat = new Chat();
	        chat.setMessage("Hello");
	        chat.setUser("User1");

	        Chat result = chatController.greeting(chat);

	        assertNotNull(result);
	        assertEquals("Hello", result.getMessage());
	        assertEquals("User1", result.getUser());
	    }

}
