package com.example.netflix.service.impl;

import com.example.netflix.client.NetflixClient;
import com.example.netflix.dto.NetflixRequest;
import com.example.netflix.dto.NetflixResponse;
import com.example.netflix.service.NetflixService;
import com.example.netflix.translate.NetflixSearchTranslate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetflixServiceimpl implements NetflixService {

    @Autowired
    NetflixClient netflixClient;
    @Autowired
    CaheManagerLocalMemory cMemory;
    @Autowired
    NetflixSearchTranslate translate;
    
    @Override
    @HystrixCommand(fallbackMethod = "defaultMethod")
    public NetflixResponse searchMovies(NetflixRequest request){
        NetflixResponse response = netflixClient.SearchMovie(request);
        cMemory.save(translate.translate(request), response);
        return response;
    }

    public NetflixResponse defaultMethod(NetflixRequest request) {
        return cMemory.contains(translate.translate(request)) 
        ? cMemory.retrieve(translate.translate(request)) 
        : buildDefaultResponse();
    }

    public NetflixResponse buildDefaultResponse(){
        return NetflixResponse.builder()
        .response("no movies found")
        .build();
    }
}
