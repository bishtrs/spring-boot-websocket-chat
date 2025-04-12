package com.bisht.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bisht.example.controller.ChatController;

@SpringBootTest(classes = Application.class)
public class IntegrationTest {

	@Autowired
	private ChatController controller;

	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
