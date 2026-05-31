package com.example.AnimalAula.controller;

import org.springframework.web.bind.annotation.*;

import com.example.AnimalAula.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService service;

    public LoginController(
            LoginService service) {

        this.service = service;
    }

    @PostMapping
    public String login(
            @RequestParam String login,
            @RequestParam String senha) {

        if(service.autenticar(login, senha)) {
            return "Login realizado com sucesso";
        }

        return "Usuário ou senha inválidos";
    }
}