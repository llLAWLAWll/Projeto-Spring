package com.example.demo.provider.viacep;

import com.example.demo.exception.BadRequestException;
import com.example.demo.provider.viacep.model.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;


@RequiredArgsConstructor
public class BuscarCepImpl implements BuscarCep{

    private final RestTemplate restTemplate;

    @Override
    public Endereco getEnderecoByCep(String cep) {

        try {
           ResponseEntity<Endereco> response =  restTemplate
                   .getForEntity(new URI("https://viacep.com.br/ws/"+cep+ "/json/"), Endereco.class);

           if(!response.getStatusCode().is2xxSuccessful())
               throw new BadRequestException("asdas", "asdasd");

           return response.getBody();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

//        return null;
    }
}
