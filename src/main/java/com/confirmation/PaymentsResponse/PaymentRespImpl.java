package com.confirmation.PaymentsResponse;

import org.bson.Document;
import org.confirmation.main.ConfirmationFromPaymentGateWayApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.stereotype.Component;

import com.mongodb.client.MongoCollection;

@Component
public class PaymentRespImpl {
	@Autowired
	MongoTemplate mongoTemplate;

	public void pushPaymentDatatoDB() {
		if (ConfirmationFromPaymentGateWayApplication.response) {

			MongoCollection<Document> mongoCollection = mongoTemplate.getCollection("PaymentsConfirmed");
			Document document = new Document();//creating document object
			document.append("Name", "rajashekat");
			document.append("TickerId", "#456");//append details 
			mongoCollection.insertOne(document);//attime Single Document will go
			System.out.println("Payment Data pushed to DB");
		} else {
			System.out.println("Payment Data not pushed to DB");
		}

	}

}
