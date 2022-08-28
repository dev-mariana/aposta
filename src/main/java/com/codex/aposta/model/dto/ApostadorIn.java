package com.codex.aposta.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ApostadorIn {
    @NotBlank
    private String nome;

    @NotBlank
    private String email;
}
