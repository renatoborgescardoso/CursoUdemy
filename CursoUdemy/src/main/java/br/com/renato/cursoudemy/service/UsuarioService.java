package br.com.renato.cursoudemy.service;

import br.com.renato.cursoudemy.entity.Usuario;
import br.com.renato.cursoudemy.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Classe responsavel por realizar as regras de negocios do {@link Usuario}
 *
 * @author Renato
 */
@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void salvar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public List<Usuario> listaUsuario() {
        return usuarioRepository.findAll();
    }

}
