package com.java.service;

import com.java.utils.Constants;
import com.java.dto.UserCreateRequest;
import com.java.model.UserMaster;
import com.java.repository.UserMasterRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class UserMasterService {

    private final UserMasterRepository repo;

    public UserMasterService(UserMasterRepository repo) {
        this.repo = repo;
    }

    // LOGIN METHOD (plain password)
    public Map<String, Object> login(String username, String password) {

        Map<String, Object> response = new HashMap<>();

        Optional<UserMaster> userOpt = repo.findByUsername(username);
        if (userOpt.isEmpty()) {
            response.put("statusCode", Constants.StatusCode.error);
            response.put("status", Constants.Messages.error);
            response.put("message", "Invalid username!");
            response.put("data", null);
            return response;
        }

        
        
        UserMaster user = userOpt.get();
        
      

        if (!password.equals(user.getPassword())) {
        	
            response.put("statusCode", Constants.StatusCode.error);
            response.put("status", Constants.Messages.error);
            response.put("message", "Invalid password!");
            response.put("data", null);
            return response;
        }

        // Update last login
        user.setLastLogin(LocalDateTime.now());
        repo.save(user);

        response.put("statusCode", Constants.StatusCode.success);
        response.put("status", Constants.Messages.success);
        response.put("message", "Login successful!");
        response.put("data", user);
        return response;
    }


    // CREATE USER METHOD (plain password)
    public Map<String, Object> createUser(UserCreateRequest req) {

        Map<String, Object> response = new HashMap<>();

        if (repo.existsByUsername(req.getUsername())) {
            response.put("statusCode", Constants.StatusCode.error);
            response.put("status", Constants.Messages.error);
            response.put("message", "Username already exists!");
            response.put("data", null);
            return response;
        }

        if (repo.existsByEmail(req.getEmail())) {
            response.put("statusCode", Constants.StatusCode.error);
            response.put("status", Constants.Messages.error);
            response.put("message", "Email already exists!");
            response.put("data", null);
            return response;
        }

        UserMaster user = new UserMaster();
        user.setUsername(req.getUsername());
        user.setEmail(req.getEmail());
        user.setMobile(req.getMobile());
        user.setPassword(req.getPassword());
        user.setStatus(UserMaster.Status.ACTIVE);
        user.setFailedAttempts(0);
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

        repo.save(user);

        response.put("statusCode", Constants.StatusCode.success);
        response.put("status", Constants.Messages.success);
        response.put("message", "User created successfully!");
        response.put("data", user);

        return response;
    }
}
