package com.example.demo.pojo;

import com.example.demo.provider.viacep.model.Endereco;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class User implements Serializable {

    private String nome;
    private String cpf;
    private Date nascimento;
    private Endereco endereco;
}
