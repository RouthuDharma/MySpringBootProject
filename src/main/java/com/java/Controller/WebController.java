package com.java.Controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/web-api")
public class WebController {

    private static final Logger log = LogManager.getLogger(WebController.class);
 
    @PostMapping("/welcome")
    public ResponseEntity<Map<String, Object>> welcome() {
        log.info("Welcome to ravikumar medi java spring boot project");

        Map<String, Object> response = new HashMap<>();
        response.put("statusCode", 200);
        response.put("status", "SUCCESS");
        response.put("message", "Welcome to ravikumar medi java spring boot project");
        
        return ResponseEntity.ok(response); 
    }


}
