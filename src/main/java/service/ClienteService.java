package service;

import entity.Cliente;
import repository.ClienteRepository;

import java.util.List;

public class ClienteService {
    private final ClienteRepository repo;

    public ClienteService(ClienteRepository repo) {
        this.repo = repo;
    }

    public Cliente crear(Cliente cliente) {
        return repo.save(cliente);
    }

    public List<Cliente> Listar(){
        return repo.findAll();
    }
}
