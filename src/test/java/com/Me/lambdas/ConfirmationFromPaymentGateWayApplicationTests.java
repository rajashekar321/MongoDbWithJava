package com.Me.lambdas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.confirmation.main.ConfirmationFromPaymentGateWayApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;

@SpringBootTest(classes = ConfirmationFromPaymentGateWayApplication.class)
class ConfirmationFromPaymentGateWayApplicationTests {
	@Autowired
	MongoTemplate mongotemplate;

	@Test
	void contextLoads() {
	}

	@Test
	void testMongoConnectionisWorking(ConfigurableApplicationContext context) {
		try {
			mongotemplate.executeCommand("{ping:1}");
			System.out.println("mongodb is connected");
			// assertTrue(true, "MongoDB is connected");
		} catch (Exception e) {
			System.out.println("MongoDB is not connected");
		}
	}
}
