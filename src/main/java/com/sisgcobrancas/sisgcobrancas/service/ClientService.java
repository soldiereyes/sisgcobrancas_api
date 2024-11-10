package com.sisgcobrancas.sisgcobrancas.service;

import com.sisgcobrancas.sisgcobrancas.model.Client;
import com.sisgcobrancas.sisgcobrancas.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public Optional<Client> getClientById(UUID id) {
        return clientRepository.findById(id);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public Client updateClient(UUID id, Client clientDetails) {
        return clientRepository.findById(id)
                .map(client -> {
                    client.setCnpj(clientDetails.getCnpj());
                    client.setCpf(clientDetails.getCpf());
                    client.setEmail(clientDetails.getEmail());
                    client.setNome(clientDetails.getNome());
                    return clientRepository.save(client);
                })
                .orElseThrow(() -> new RuntimeException("Client not found with id: " + id));
    }

    public void deleteClient(UUID id) {
        clientRepository.deleteById(id);
    }
}
