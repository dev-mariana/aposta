package com.codex.aposta.controller;

import com.codex.aposta.model.dto.ApostaIn;
import com.codex.aposta.model.dto.ApostaOut;
import com.codex.aposta.model.dto.ApostasOut;
import com.codex.aposta.service.ApostaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RequiredArgsConstructor
@RestController
public class ApostaController {
    private final ApostaService apostaService;

    @PostMapping("/aposta")
    public ResponseEntity<ApostaOut> salvarAposta(@Valid @RequestBody ApostaIn apostaIn) {
        ApostaOut apostaOut = apostaService.salvarAposta(apostaIn);

        return ResponseEntity.status(CREATED).body(apostaOut);
    }

    @GetMapping("/buscarApostasPorIdApostador/{idApostador}")
    public List<ApostasOut> buscarApostasPorIdApostador(@PathVariable Long idApostador) {
        return apostaService.buscarApostasPorIdApostador(idApostador);
    }
}
