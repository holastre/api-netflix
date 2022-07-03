package com.example.netflix.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
public class NetflixSearch {
    private String s;
    private String type;

    public String generateKey(){
        return s.concat(type);
    }
}
