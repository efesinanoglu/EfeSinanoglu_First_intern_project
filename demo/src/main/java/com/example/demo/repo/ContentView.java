package com.example.demo.repo;


import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "ContentView", description = "Projection of Content")
public interface ContentView {
    Long getId();
    String getFile();
    String getTextBlock();
}
