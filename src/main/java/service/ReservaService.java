package service;

import entity.Reserva;
import repository.ReservaRepository;

import java.util.List;

public class ReservaService {
    private final ReservaRepository repo;

    public ReservaService(ReservaRepository repo) {
        this.repo = repo;
    }

    public Reserva crear(Reserva reserva) {
        return repo.save(reserva);
    }

    public List<Reserva> Listar() {
        return repo.findAll();
    }

    public Reserva actualizarEstado(Long id, String estado) {
        Reserva reserva = repo.findById(id).orElseThrow();
        reserva.setEstado(estado);
        return repo.save(reserva);
    }

}
