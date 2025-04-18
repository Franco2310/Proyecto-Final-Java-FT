package com.finalThevenet.demo.service;



import com.finalThevenet.demo.model.Client;
import com.finalThevenet.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clienteRepository;

    public Client crearCliente(Client cliente) throws Exception {
        return clienteRepository.save(cliente);
    }
    public Client obtenerCliente(int id) throws Exception {
        Optional<Client> clienteExistente = clienteRepository.findById(id);
        if(clienteExistente.isEmpty()){
            throw new Exception("Client with id: " + id + " not found.");
        } else {
            return clienteExistente.get();
        }
    }

    public void modificarCliente(Client client, int id) throws Exception {
        Optional<Client> clienteExistente = clienteRepository.findById(id);
        if(clienteExistente.isEmpty()){
            throw new Exception("Client with id: " + id + " not found.");
        } else {
            clienteExistente.get().setDocnumber(client.getDocnumber());
            clienteExistente.get().setName(client.getName());
            clienteExistente.get().setLastname(client.getLastname());
            clienteRepository.save(clienteExistente.get());
        }
    }

    public void borrarCliente (int id) throws Exception {
        Optional<Client> clienteExistente = clienteRepository.findById(id);
        if(clienteExistente.isEmpty()){
            throw new Exception("Client with id: " + id + " not found.");
        } else {
            clienteRepository.deleteById(id);
        }
    }
}