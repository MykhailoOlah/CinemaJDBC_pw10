package com.olah.cinema.persistence.service.contracts;

import com.olah.cinema.persistence.entity.Client;
import java.util.List;

public interface ClientService {
	boolean createClient(Client client);
	List<Client> getAllClients();
	Client getByClientId(Integer id);
	boolean updateClient(Client client);
	boolean deleteClient(Integer id);
}
