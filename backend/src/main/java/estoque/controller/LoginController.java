package estoque.controller;

import org.springframework.web.bind.annotation.*;
import estoque.service.LoginService;

@RestController
@RequestMapping("/login")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
    private final LoginService service;

    public LoginController(LoginService service) {
        this.service = service;
    }

    @PostMapping
    public String login(@RequestParam String login, @RequestParam String senha) {
        if (service.autenticar(login, senha)) {
            return "Login realizado com sucesso";
        }
        return "Usuário ou senha inválidos";
    }
}