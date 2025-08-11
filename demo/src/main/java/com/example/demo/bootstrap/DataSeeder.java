package com.example.demo.bootstrap;

import com.example.demo.model.Content;
import com.example.demo.repo.ContentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder {

    private final ContentRepository repo;

    public DataSeeder(ContentRepository repo) {
        this.repo = repo;
    }

    // Seed sample rows at startup
    @PostConstruct
    public void init() {
        if (repo.count() == 0) {
            repo.save(new Content(
                    "https://picsum.photos/seed/alpha/600/400",
                    "Hello world!"
            ));
            repo.save(new Content(
                    "https://picsum.photos/seed/bravo/600/400",
                    "Content is in a test"
            ));
            repo.save(new Content(
                    "https://picsum.photos/seed/charlie/600/400",
                    "Sample content."
            ));
        }
    }
}
