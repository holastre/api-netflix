package com.example.netflix.service.impl;

import java.util.HashMap;

import com.example.netflix.dto.NetflixResponse;
import com.example.netflix.dto.NetflixSearch;
import com.example.netflix.service.CacheManager;

import org.springframework.stereotype.Service;

@Service
public class CaheManagerLocalMemory implements CacheManager {

    HashMap<String, NetflixResponse> cache = new HashMap<>();


    @Override
    public void save(NetflixSearch search, NetflixResponse response){
        cache.put(search.generateKey(), response);
    }
    @Override
    public NetflixResponse retrieve(NetflixSearch search){
        return cache.get(search.generateKey());
    }

    @Override
    public Boolean contains(NetflixSearch search){
        return cache.containsKey(search.generateKey()) ? true : false;
    }

}
