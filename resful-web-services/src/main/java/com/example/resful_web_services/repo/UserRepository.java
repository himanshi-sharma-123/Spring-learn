package com.example.resful_web_services.repo;

import com.example.resful_web_services.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
