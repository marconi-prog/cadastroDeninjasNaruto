package dev.java10x.cadastroDeninjasNaruto.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/listar")
    public String listarMissao(){
        return "missao listadas com sucesso";
    }

    // localhost:8080/missoes/criar
    @PostMapping("/criar")
    public String criarMissao(){
        return "missao criada com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "missao alterada com sucesso";
    }
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "missao deletada com sucesso";
    }
}
