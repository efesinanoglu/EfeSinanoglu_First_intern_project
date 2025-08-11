package com.example.demo.web;

import com.example.demo.repo.ContentRepository;
import com.example.demo.repo.ContentView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contents")
public class ContentController {

    private final ContentRepository repo;

    public ContentController(ContentRepository repo) {
        this.repo = repo;
    }

    // Returns List<ContentView> (id, image, textBlock)
    @GetMapping
    public List<ContentView> list() {
        return repo.findAllProjectedBy();
    }
}
