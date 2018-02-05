package br.com.renato.cursoudemy.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Renato
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    public String getIndex(@PathVariable String nome) {
        return "Ola " +nome;
    }

}
