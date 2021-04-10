package com.hibernate.tutorial.service;

import com.hibernate.tutorial.dao.ClientDao;
import com.hibernate.tutorial.model.Client;

import java.util.List;

public class ClientService {

    private ClientDao clientDao;

    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public void save(Client client) {
        clientDao.insertOrUpdate(client);
    }

    public void delete(Client client) {
        clientDao.delete(client);
    }

    public Client get(int id) {
        return clientDao.get(id);
    }

    public List<Client> getAll() {
        return clientDao.getAll();
    }
}
