package com.coderhouse.Clase13_RestExternos.apis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.coderhouse.Clase13_RestExternos.interfaces.UserRestInterface;
import com.coderhouse.Clase13_RestExternos.models.User;



@Component
public class UserRestApi implements UserRestInterface{

    private final String BASE_URL = "https://6733fb45a042ab85d1188eee.mockapi.io/users";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<User> getAllUsers() {
        try {

            @SuppressWarnings("unchecked")
            List<User> users = restTemplate.exchange(BASE_URL, HttpMethod.GET, null, List.class).getBody();

            return users;

        } catch (Exception e) {
            throw new RuntimeException("Error al obtener los usuarios: " + e.getMessage(), e);
        }
    }

    @Override
    public User getUserById(String id) {
        try {

            String url = BASE_URL + "/" + id;
            return restTemplate.getForObject(url, User.class);

    
            
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener el usuario: " + e.getMessage(), e);
        }
    }

    @Override
    public User addUser(User user) {
        try {

            return restTemplate.postForObject(BASE_URL, user, User.class);
            
        } catch (Exception e) {
            throw new RuntimeException("Error al agregar el usuario: " + e.getMessage(), e);
        }
    }

    @Override
    public User updateUser(User user) {
        try {

            String url = BASE_URL + "/" + user.getId();
            restTemplate.put(url, user);
            return user;
                
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar el usuario: " + e.getMessage(), e);
        }
    }

    @Override
    public void deleteUser(String id) {
        try {

            String url = BASE_URL + "/" + id;
            restTemplate.delete(url);
                
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar el usuario: " + e.getMessage(), e);
        }
    }

}
