package com.example.demo.controller;

import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.ControllerException;
import com.example.demo.exception.NotFoundExeption;
import com.example.demo.pojo.User;
import com.example.demo.provider.viacep.BuscarCep;
import com.example.demo.provider.viacep.model.Endereco;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    private final BuscarCep buscarCep;

    @GetMapping()
    public ResponseEntity<String> getUser(@RequestBody User client){
        throw new BadRequestException("badRequest", "erro na chamada do getUser");
    }

    @PostMapping
    public ResponseEntity<User> postUser(@RequestBody User client){
        return ResponseEntity.ok(userService.createUser(client));
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

