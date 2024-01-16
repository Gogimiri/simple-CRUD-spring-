package com.example.river_2.controller;

import com.example.river_2.models.UserEntity;
import com.example.river_2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public HttpStatus add(@RequestBody UserEntity userEntity) {
        userService.addUser(userEntity);
        return HttpStatus.valueOf(200);
    }
    @GetMapping("/getAll")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        userService.deleteById(id);
        return HttpStatus.valueOf(200);
    }
}
