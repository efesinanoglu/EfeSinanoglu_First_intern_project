package com.example.demo.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "contents")
@Schema(description = "Content Entity")
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

    public Content(String file, String textBlock){
        this.file = file;
        this.textBlock = textBlock;
    }
    }
