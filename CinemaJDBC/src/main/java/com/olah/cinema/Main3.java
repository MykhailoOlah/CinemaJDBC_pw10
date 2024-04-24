package com.olah.cinema;

import static java.lang.System.out;

import com.olah.cinema.persistence.entity.Client;
import com.olah.cinema.persistence.service.impl.AuthenticationServiceImpl;

public class Main3 {

	private static final AuthenticationServiceImpl authenticationService
	    = AuthenticationServiceImpl.getInstance();

	public static void main(String[] args) {
		authenticationServiceTest();
	}

//	1,Новий,1234,+3098655456
//	    2,Новий2024,1234,+3098655456
//	    3,Новий2024,1234,+3098655456
//	    4,Новий2024,1234,+3098655456

	private static void authenticationServiceTest() {
		Client client = authenticationService.authenticate(2, "Новий2024", "1234");
		if (client != null) {
			out.println("Успішна аутентифікація");
		} else {
			out.println(
			    "Помилка аутентифікації. Користувача за введеними даними не знайдено");
		}
	}
}
