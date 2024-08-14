package com.example.resful_web_services.repo;

import com.example.resful_web_services.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
