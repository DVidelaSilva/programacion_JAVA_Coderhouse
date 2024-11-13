package com.coderhouse.Clase13_RestExternos.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderhouse.Clase13_RestExternos.models.User;
import com.coderhouse.Clase13_RestExternos.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/", produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<User>> getAllUsers(){
        try {
            
            List<User> users = userService.getAllUsers();
            return ResponseEntity.ok(users);

        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
        
    }


    @GetMapping(value = "/{id}", produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<User> getUserById(@PathVariable String id){
        try {

            User user = userService.getUserById(id);
            return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();

        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }



    @PostMapping(value = "/", consumes = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<User> addUser(@RequestBody User user){
        try {

            User newUser = userService.addUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
            
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }



    @PutMapping(value = "/{id}", consumes = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User user){
        try {

            user.setId(id);
            User updateUser = userService.updateUser(user);
            return ResponseEntity.ok(updateUser);
            
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }




    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteUser (@PathVariable String id){
        try {
            
            userService.deleteUser(id);
            return ResponseEntity.noContent().build();

        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }

}