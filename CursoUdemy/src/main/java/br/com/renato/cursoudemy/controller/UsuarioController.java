package br.com.renato.cursoudemy.controller;

import br.com.renato.cursoudemy.entity.Usuario;
import br.com.renato.cursoudemy.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe responsavel por disponibilizar os endpoint do usuário.
 *
 * @author Renato
 */
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public List<Usuario> listaUsuario() {
        return usuarioService.listaUsuario();
    }

    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
    public String salvar(@RequestBody Usuario usuario) {
        usuarioService.salvar(usuario);
        return "Usuário salvo com sucesso." + usuario.getNome();
    }

}
