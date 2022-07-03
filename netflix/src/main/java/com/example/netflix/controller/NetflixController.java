package com.example.netflix.controller;

import com.example.netflix.dto.NetflixRequest;
import com.example.netflix.dto.NetflixResponse;
import com.example.netflix.service.NetflixService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/imdb/search")
public class NetflixController {

    private final NetflixService nService;

    @PostMapping
    public ResponseEntity<NetflixResponse> searchMovies (@RequestBody NetflixRequest request) {
        return ResponseEntity.ok(nService.searchMovies(request));
    }
    
}
