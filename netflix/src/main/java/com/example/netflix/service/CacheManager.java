package com.example.netflix.service;

import com.example.netflix.dto.NetflixResponse;
import com.example.netflix.dto.NetflixSearch;

public interface CacheManager {

    void save(NetflixSearch search, NetflixResponse response);

    NetflixResponse retrieve(NetflixSearch search);

    Boolean contains(NetflixSearch search);
    
}
