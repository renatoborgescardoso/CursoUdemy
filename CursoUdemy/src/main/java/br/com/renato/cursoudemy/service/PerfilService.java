package br.com.renato.cursoudemy.service;

import br.com.renato.cursoudemy.entity.Perfil;
import br.com.renato.cursoudemy.entity.Usuario;
import br.com.renato.cursoudemy.repository.PerfilRepository;
import br.com.renato.cursoudemy.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Classe responsavel por realizar as regras de negocios do {@link Usuario}
 *
 * @author Renato
 */
@Service
public class PerfilService {

    @Autowired
    PerfilRepository perfilRepository;

    public void salvar(Perfil perfil) {
        perfilRepository.save(perfil);
    }

    public List<Perfil> listaPerfil() {
        return perfilRepository.findAll();
    }

    public void deletar(String id) {
        perfilRepository.delete(id);
    }
    
    public Perfil consultarPerfil(String id) {
        return perfilRepository.findOne(id);
    }
    
    public List<Perfil> consultaPaginada(int size, int page) {
        Pageable pages = new PageRequest(page, size);
        return (List<Perfil>) perfilRepository.findAll(pages);
    }

}
