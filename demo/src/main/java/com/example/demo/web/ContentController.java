package com.example.demo.web;

import com.example.demo.repo.ContentRepository;
import com.example.demo.repo.ContentView;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Tag(name = "Contents", description = "Contents projections")
@RestController
@RequestMapping("/api/contents")
public class ContentController {

    private final ContentRepository repo;

    public ContentController(ContentRepository repo) {
        this.repo = repo;
    }

    @Operation (
            summary = "List contents",
            description = "Returns the ContentView projection (id, file, textblock)"
    )

    // Returns List<ContentView> (id, image, textBlock)
    @GetMapping
    public List<ContentView> list() {
        return repo.findAllProjectedBy();
    }
}
