package org.confirmation.PaymentModel;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "PaymentsConfirmed")
public class PayementModel {
	@Field("Ticketid")
	String TicketId;
	@Field("Name")
	String Name;
	@Field("CreatedAt")
	double createdAt;
	@Field("Amount")
	double amount;

}
