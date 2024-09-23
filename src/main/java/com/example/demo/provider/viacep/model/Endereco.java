package com.example.demo.provider.viacep.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Endereco {

    @JsonProperty("cep")
    private String zipCode;
    private String logradouro;
    private String uf;
    @JsonProperty("bairro")
    private String neiberhoor;
}
