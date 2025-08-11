package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "contents")
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Store a file path/URL or large text (kept as LOB like your example)
    @Lob
    @Column(name = "file")
    private String file;

    @Column(name = "textblock")
    private String textBlock;
}
