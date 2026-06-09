package Controller;

import entity.Servicio;
import org.springframework.web.bind.annotation.*;
import service.ServicioService;

import java.util.List;

@RestController
@RequestMapping("/api/servicio")
public class ServicioController {
    private final ServicioService service;

    public ServicioController(ServicioService service) {
        this.service = service;
    }

    @PostMapping
    public Servicio crear(@RequestBody Servicio servicio) {
        return service.crear(servicio);
    }

    @GetMapping
    public List<Servicio> listar() {
        return service.Listar();
    }
}