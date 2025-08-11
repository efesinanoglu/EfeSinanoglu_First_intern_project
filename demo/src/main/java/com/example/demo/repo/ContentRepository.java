package com.example.demo.repo;

import com.example.demo.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContentRepository extends JpaRepository<Content, Long> {
    // Returns interface projection
    List<ContentView> findAllProjectedBy();
}
