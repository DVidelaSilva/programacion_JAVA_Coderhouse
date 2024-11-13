package com.coderhouse.Clase13_RestExternos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.Clase13_RestExternos.apis.UserRestApi;
import com.coderhouse.Clase13_RestExternos.interfaces.UserRestInterface;
import com.coderhouse.Clase13_RestExternos.models.User;


@Service
public class UserService implements UserRestInterface{

    @Autowired
    private UserRestApi userRestApi;


    @Override
    public List<User> getAllUsers() {
        
        return userRestApi.getAllUsers();
    }

    @Override
    public User getUserById(String id) {
        
        return userRestApi.getUserById(id);
    }

    @Override
    public User addUser(User user) {
        
        return userRestApi.addUser(user);
    }

    @Override
    public User updateUser(User user) {
        
        return userRestApi.updateUser(user);
    }

    @Override
    public void deleteUser(String id) {
        
        userRestApi.deleteUser(id);
    }

}
