package com.example.river_2.service;

import java.util.List;

import com.example.river_2.models.UserEntity;
import com.example.river_2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List <UserEntity> findAll(){

        return userRepository.findAll();
    }

    public UserEntity findById(Long id) {
        return userRepository.findById(id).get();
    }

    public UserEntity addUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }


    
}
