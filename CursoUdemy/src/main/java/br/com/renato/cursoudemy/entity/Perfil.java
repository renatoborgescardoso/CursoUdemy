package br.com.renato.cursoudemy.entity;

import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Renato
 */
@Document
public class Perfil {

    private String id;
    private String nome;
    
    private List<Perfil> perfils;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
