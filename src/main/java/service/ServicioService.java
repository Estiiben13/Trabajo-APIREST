package service;

import entity.Servicio;
import repository.ServicioRepository;

import java.util.List;

public class ServicioService {
    private final ServicioRepository repo;

    public ServicioService(ServicioRepository repo) {
        this.repo = repo;
    }

    public Servicio crear(Servicio servicio) {
        return repo.save(servicio);
    }

    public List<Servicio> Listar() {
        return repo.findAll();
    }
}
