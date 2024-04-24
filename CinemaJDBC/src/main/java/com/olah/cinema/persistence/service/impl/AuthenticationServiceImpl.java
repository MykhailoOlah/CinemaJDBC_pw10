package com.olah.cinema.persistence.service.impl;

import com.olah.cinema.persistence.entity.Client;
import com.olah.cinema.persistence.service.contracts.AuthenticationService;

public class AuthenticationServiceImpl implements AuthenticationService {

	private final ClientServiceImpl userService = ClientServiceImpl.getInstance();

	private AuthenticationServiceImpl() {
	}

	private static class AuthenticationServiceImplHolder {

		private static final AuthenticationServiceImpl authenticationServiceImpl = new AuthenticationServiceImpl();
	}

	public static AuthenticationServiceImpl getInstance() {
		return AuthenticationServiceImplHolder.authenticationServiceImpl;
	}

	@Override
	public Client authenticate(Integer id, String fullName, String password) {
		Client client = userService.getByClientId(id);
		if (client != null && (client.getFullname().equals(fullName) && client.getPassword()
		    .equals(password))) {
			return client;
		}
		return null;
	}
}