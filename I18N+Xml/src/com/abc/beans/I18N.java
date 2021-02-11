package com.abc.beans;

import java.util.Locale;


import org.springframework.context.MessageSource;

public class I18N {

	private MessageSource messageSource;

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public void displayMessage() {
		System.out.println("Message is :" + messageSource.getMessage("welcome", null, Locale.US));

	}

}
