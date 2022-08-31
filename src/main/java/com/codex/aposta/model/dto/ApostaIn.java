package com.codex.aposta.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
@AllArgsConstructor
public class ApostaIn {
    @NotNull
    private Long idApostador;
}
