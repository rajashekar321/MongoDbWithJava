package org.confirmation.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.confirmation.PaymentsResponse.PaymentRespImpl;

import jakarta.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "com.confirmation.PaymentsResponse")
public class ConfirmationFromPaymentGateWayApplication {
	public static boolean response = true;

	@Autowired
	PaymentRespImpl paymentsRespImpl;

	public static void main(String[] args) {
		System.out.println("Application Started");
		SpringApplication.run(ConfirmationFromPaymentGateWayApplication.class, args);
		System.out.println("Application Ended Successfully");

	}

	@PostConstruct
	void init() {
		paymentsRespImpl.pushPaymentDatatoDB();
	}

}
