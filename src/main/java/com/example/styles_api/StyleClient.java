package com.example.styles_api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "style-client", url="https://api.iconfinder.com")
public interface StyleClient {

    @GetMapping("/v4/styles")
    StyleResponseBody getAllStyles(@RequestParam int count);

}
