package com.example.styles_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StyleController {

    private final StyleClient styleClient;

    @Autowired
    public StyleController(StyleClient styleClient) {
        this.styleClient = styleClient;
    }

    @GetMapping("/getStyles")
    ResponseEntity<StyleResponseBody> getStyles(@RequestParam int count){
        StyleResponseBody responseBody = styleClient.getAllStyles(count);
        return ResponseEntity.ok(responseBody);
    }
}
