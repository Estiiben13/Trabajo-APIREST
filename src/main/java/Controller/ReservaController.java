package Controller;

import entity.Reserva;
import org.springframework.web.bind.annotation.*;
import service.ReservaService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/reserva")
public class ReservaController {
    private final ReservaService service;

    public ReservaController(ReservaService service) {
        this.service = service;
    }

    @PostMapping
    public Reserva crear(@RequestBody Reserva reserva) {
        return service.crear(reserva);
    }

    @GetMapping
    public List<Reserva> listar() {
        return service.Listar();
    }

    @PutMapping("/{id}/estado")
    public Reserva cambiarEstado(@PathVariable Long id, @RequestBody Map<String, String> body) {
        return service.actualizarEstado(id, body.get("estado"));
    }

}
