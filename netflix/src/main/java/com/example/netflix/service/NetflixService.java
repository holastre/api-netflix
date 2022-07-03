package com.example.netflix.service;

import com.example.netflix.dto.NetflixRequest;
import com.example.netflix.dto.NetflixResponse;

public interface NetflixService {
    NetflixResponse searchMovies(NetflixRequest request);
}
