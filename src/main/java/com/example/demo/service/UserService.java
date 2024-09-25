package com.example.demo.service;

import com.example.demo.exception.BadRequestException;
import com.example.demo.pojo.User;
import com.example.demo.provider.viacep.BuscarCep;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Data
@Service
@RequiredArgsConstructor
public class UserService {

    private final BuscarCep buscarCep;

    public User createUser(User user) {

      if (null == user){
          throw new BadRequestException("Usuario não encontrado!", null);
      } else if (null == user.getEndereco().getZipCode()) {
          throw new BadRequestException("", "");
      }else{
          user.setEndereco(buscarCep.getEnderecoByCep(user.getEndereco().getZipCode()));
      }
        return user;
    }



}
