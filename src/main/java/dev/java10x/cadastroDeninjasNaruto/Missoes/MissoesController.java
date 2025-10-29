package dev.java10x.cadastroDeninjasNaruto.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/missoes")
    public String missoes(){
        return "kk";
    }
}
