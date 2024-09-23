package com.example.demo.config;

import com.example.demo.provider.viacep.BuscarCep;
import com.example.demo.provider.viacep.BuscarCepImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppConfig {

    @Bean
    BuscarCep buscarCep(){
        return new BuscarCepImpl(new RestTemplate());
    }
}
