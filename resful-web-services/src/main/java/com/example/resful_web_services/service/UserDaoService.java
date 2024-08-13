package com.example.resful_web_services.service;

import com.example.resful_web_services.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    static{
        users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
        users.add(new User(2, "Eve", LocalDate.now().minusYears(25)));
        users.add(new User(3, "Jim", LocalDate.now().minusYears(20)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findOne(Integer id) {
        return users.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst().orElse(null);
    }

    public User save(User user){
        users.add(user);
        return user;
    }

    public void deleteById(int id){
         users.removeIf(p -> p.getId().equals(id));

    }


}
