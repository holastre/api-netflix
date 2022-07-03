package com.example.netflix.translate;

import com.example.netflix.dto.NetflixRequest;
import com.example.netflix.dto.NetflixSearch;

import org.springframework.stereotype.Service;

@Service
public class NetflixSearchTranslate {
    public NetflixSearch translate(NetflixRequest request){
        return NetflixSearch.builder()
        .s(request.getS())
        .type(request.getType())
        .build();
    }
}
