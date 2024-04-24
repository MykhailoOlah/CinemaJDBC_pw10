package com.olah.cinema.persistence.service.contracts;

import com.olah.cinema.persistence.entity.Client;

public interface AuthenticationService {

	Client authenticate(Integer id, String username, String password);
}
