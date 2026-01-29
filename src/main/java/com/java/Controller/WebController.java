package com.java.Controller;

import java.util.HashMap;
import java.util.Map;

import com.java.utils.Constants;
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
        log.info("Welcome to BDRsquare java spring boot project");

        Map<String, Object> response = new HashMap<>();
        response.put("statusCode", Constants.StatusCode.success);
        response.put("status", Constants.Messages.success);
        response.put("message", "Welcome to BDRsquare java spring boot project");
        
        return ResponseEntity.ok(response); 
    }


}
