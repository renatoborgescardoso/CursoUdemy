package br.com.renato.cursoudemy.repository;

import br.com.renato.cursoudemy.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Renato
 */
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
