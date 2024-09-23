package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.provider.viacep.BuscarCep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final BuscarCep buscarCep;

}
