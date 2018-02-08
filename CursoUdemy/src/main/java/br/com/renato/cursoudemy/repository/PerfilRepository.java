package br.com.renato.cursoudemy.repository;

import br.com.renato.cursoudemy.entity.Perfil;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Renato
 */
public interface PerfilRepository extends MongoRepository<Perfil, String>{
    
}
