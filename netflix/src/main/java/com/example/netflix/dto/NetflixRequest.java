package com.example.netflix.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class NetflixRequest {
    private String type;
    private String s;
    private String apiKey;
}
