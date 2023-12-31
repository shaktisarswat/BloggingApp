package com.spring.blog.repositories;

import com.spring.blog.entities.Category;
import com.spring.blog.entities.Post;
import com.spring.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PostRepository extends JpaRepository<Post, Integer> {

    public List<Post> findByCategory(Category category);

    public List<Post> findByUser(User user);
}
