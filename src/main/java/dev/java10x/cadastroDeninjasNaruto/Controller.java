package dev.java10x.cadastroDeninjasNaruto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
    public String boasvindas(){
       return "essa e minha primeira rota";
    }
    @GetMapping("/ola")
    public String ola(){
        return "ola";
    }

}
