package estoque.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import estoque.model.Mercadoria;
import estoque.service.MercadoriaService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/mercadorias")
public class MercadoriaController {
    private final MercadoriaService service;

    public MercadoriaController(MercadoriaService service){
        this.service = service;
    }

    @GetMapping
    public List<Mercadoria> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Mercadoria buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Mercadoria editar(@PathVariable Long id,
                            @RequestBody Mercadoria mercadoria) {
        return service.editar(id, mercadoria);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
        
}
