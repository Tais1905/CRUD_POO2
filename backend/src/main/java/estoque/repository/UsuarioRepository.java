package com.example.AnimalAula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AnimalAula.model.Usuario;

public interface UsuarioRepository
        extends JpaRepository<Usuario, Long> {

    Usuario findByLoginAndSenha(
            String login,
            String senha);
}