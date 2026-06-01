package estoque.service;

import org.springframework.stereotype.Service;
import estoque.model.Usuario;
import estoque.repository.UsuarioRepository;

@Service
public class LoginService {
    private final UsuarioRepository repository;

    public LoginService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public boolean autenticar(String login, String senha) {
        Usuario usuario = repository.findByLoginAndSenha(login, senha);
        return usuario != null;
    }
}