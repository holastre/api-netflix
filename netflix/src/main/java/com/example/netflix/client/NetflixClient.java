package com.example.netflix.client;

import com.example.netflix.dto.NetflixRequest;
import com.example.netflix.dto.NetflixResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "localhost:8081/imdb/search",
value = "netflix-client")
public interface NetflixClient {

    @PostMapping()
    public NetflixResponse SearchMovie(@RequestBody NetflixRequest request);

}
