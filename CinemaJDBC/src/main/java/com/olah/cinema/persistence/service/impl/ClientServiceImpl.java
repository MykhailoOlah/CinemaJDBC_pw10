package com.olah.cinema.persistence.service.impl;

import com.olah.cinema.persistence.dao.ClientDao;
import com.olah.cinema.persistence.entity.Client;
import com.olah.cinema.persistence.service.contracts.ClientService;
import java.util.List;

public class ClientServiceImpl implements ClientService {

	private final ClientDao clientDao = ClientDao.getInstance();
	private ClientServiceImpl() {
	}
	private static class UserServiceImplHolder{
		public static final ClientServiceImpl USER_SERVICE_INSTANCE = new ClientServiceImpl();
	}
	public static ClientServiceImpl getInstance(){
		return UserServiceImplHolder.USER_SERVICE_INSTANCE;
	}
	@Override
	public boolean createClient(Client client) {
		return clientDao.create(client);
	}

	@Override
	public List<Client> getAllClients() {
		return clientDao.getAll();
	}

	@Override
	public Client getByClientId(Integer id) {
		return clientDao.getById(id);
	}
	@Override
	public boolean updateClient(Client client) {
		return clientDao.update(client);
	}

	@Override
	public boolean deleteClient(Integer id) {
		return clientDao.delete(id);
	}
}
