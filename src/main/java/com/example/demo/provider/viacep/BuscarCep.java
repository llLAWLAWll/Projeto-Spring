package com.example.demo.provider.viacep;

import com.example.demo.provider.viacep.model.Endereco;

public interface BuscarCep {
    Endereco getEnderecoByCep(String cep);
}
