package com.codex.aposta.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
public class ApostadorIn {
    @NotBlank
    private String nome;

    @NotBlank
    private String email;
}
