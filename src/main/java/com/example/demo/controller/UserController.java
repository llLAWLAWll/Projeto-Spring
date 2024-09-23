package com.example.demo.controller;

import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.ControllerException;
import com.example.demo.exception.NotFoundExeption;
import com.example.demo.pojo.User;
import com.example.demo.provider.viacep.BuscarCep;
import com.example.demo.provider.viacep.model.Endereco;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final BuscarCep buscarCep;

    @GetMapping()
    public ResponseEntity<User> getUser(){

        User user = new User("a", "B", new Date());

        if (null == user){
            throw new NotFoundExeption("notFound", "Usuário não encontrado!");
        }

        return ResponseEntity.ok(user);

    }

    @PostMapping
    public ResponseEntity<Void> postUser(@RequestBody User client){

        if (null == client.getNome() || null == client.getCpf()) {
            throw new BadRequestException("badRequest", "Nome ou CPF Invalido");
        }

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deleteUser(@PathVariable("cpf") String cpf){

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{cep}")
    public ResponseEntity<Endereco> getEnderecoByCep(@PathVariable("cep") String cep){
        return ResponseEntity.ok(buscarCep.getEnderecoByCep(cep));
    }

}

