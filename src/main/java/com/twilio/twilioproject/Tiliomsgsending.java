package com.twilio.twilioproject;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class Tiliomsgsending {
	// Find your Account Sid and Token at twilio.com/console
	public static final String ACCOUNT_SID = "AC5ff509a1c0889c0b7c188b51abdd92b4";
	public static final String AUTH_TOKEN = "5df944b3ec59cd5506fbb78bbbde6f1f";

	public static void main(String[] args) {
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		Message message = Message.creator(new com.twilio.type.PhoneNumber("7904734657"),
				new com.twilio.type.PhoneNumber("+14066257378"), "Hai i am developer pkgobi").create();

		System.out.println(message.getSid());
	}
}
