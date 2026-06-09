package Controller;

import entity.Cliente;
import org.springframework.web.bind.annotation.*;
import service.ClienteService;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public Cliente crear(@RequestBody Cliente cliente) {
        return service.crear(cliente);
    }

    @GetMapping
    public List<Cliente> listar() {
        return service.Listar();
    }
}
