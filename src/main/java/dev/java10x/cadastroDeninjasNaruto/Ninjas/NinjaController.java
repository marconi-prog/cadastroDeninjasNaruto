package dev.java10x.cadastroDeninjasNaruto.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasvindas(){
       return "essa e minha primeira rota";
    }
    // Adicionar ninja (Create)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    // Mostrar ninjas (Read)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "ninja criado";
    }
    // Mostrar ninjas por id (Read)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "mostar ninja por id";
    }

    // Alterar dados dos ninjas (Update)
    @PutMapping("/alterarID")
    public String alterarNinjasPorId(){
        return "alterar ninja por id";
    }
    // Deletar ninja (Delete)
    @DeleteMapping("/deletarID")
    public String deletarNinjaporId(){
        return "deletar ninjas por id";
    }
}