package dev.java10x.cadastroDeninjasNaruto.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/missoes")
    public String missoes(){
        return "kk";
    }

    // Adicionar ninja (Create)
    @PostMapping("/criar")
    public String criar(){
        return "Ninja";
    }
    // Procurar ninja por id (Create)
    @GetMapping("/mostrarid")
    public String ninjaid(){
        return "Ninja";
    }

    // Mostrar ninjas (Read)
    @GetMapping("/mostrarninjas")
    public String listarninja(){
        return "ninja";
    }

    // Alterar dados dos ninjas (Update)

    // Deletar ninja (Delete)
}
