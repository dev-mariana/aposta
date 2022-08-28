package com.codex.aposta.controller;

import com.codex.aposta.model.dto.ApostadorIn;
import com.codex.aposta.service.ApostadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
public class ApostadorController {
    private final ApostadorService apostadorService;

    @PostMapping("/apostador")
    public ResponseEntity salvarApostador(@Valid @RequestBody ApostadorIn apostadorIn) {
        apostadorService.salvarApostador(apostadorIn);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
