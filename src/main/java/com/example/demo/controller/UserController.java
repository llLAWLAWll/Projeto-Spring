package com.example.demo.controller;

import com.example.demo.exception.BadRequestException;
import com.example.demo.pojo.User;
import com.example.demo.provider.viacep.BuscarCep;
import com.example.demo.provider.viacep.model.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    @GetMapping()
    public ResponseEntity<String> getUer(@RequestBody User client){
        throw new BadRequestException("badRequest", "erro na chamada do getUser");
    }

    @PostMapping
    public Void postUser(@RequestBody User client){
        return null;
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deleteUser(@PathVariable("cpf") String cpf){

        return ResponseEntity.ok().build();
    }

}

