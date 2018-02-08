package br.com.renato.cursoudemy.controller;

import br.com.renato.cursoudemy.entity.Perfil;
import br.com.renato.cursoudemy.service.PerfilService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
public class PerfilController {

    @Autowired
    private PerfilService perfilService;

    @RequestMapping(value = "/perfil", method = RequestMethod.GET)
    public List<Perfil> listaPerfil() {
        return perfilService.listaPerfil();
    }

    @RequestMapping(value = "/perfil", method = RequestMethod.POST)
    public String salvar(@RequestBody Perfil perfil) {
        perfilService.salvar(perfil);
        return "Perfil salvo com sucesso." + perfil.getNome();
    }
    
    @RequestMapping(value = "/perfil", method = RequestMethod.PUT)
    public String alterar(@RequestBody Perfil perfil) {
        perfilService.salvar(perfil);
        return "Perfil alterado com sucesso." + perfil.getNome();
    }
    
    @RequestMapping(value = "/perfil/{id}", method = RequestMethod.DELETE)
    public String deletar(@PathVariable String id) {
        perfilService.deletar(id);
        return "Perfil excluido com sucesso.";
    }

    @RequestMapping(value = "/perfil/{id}", method = RequestMethod.GET)
    public Perfil consultarPerfil(@PathVariable String id) {
        return perfilService.consultarPerfil(id);
    }
    
    @RequestMapping(value = "/perfil/{page}/{size}", method = RequestMethod.GET)
    public List<Perfil> consultaPaginada(@PathVariable int page, @PathVariable int size) {
        return perfilService.consultaPaginada(size, page);
    }

}
