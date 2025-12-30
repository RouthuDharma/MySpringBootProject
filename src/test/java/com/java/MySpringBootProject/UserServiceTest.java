package com.java.MySpringBootProject;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import com.java.dto.UserCreateRequest;
import com.java.model.UserMaster;
import com.java.repository.UserMasterRepository;
import com.java.service.UserMasterService;
import com.java.utils.Constants;
import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@Mock
	private UserMasterRepository repo;
	
	@InjectMocks
	private UserMasterService service;
	
	
	@Test
	void createUser_whenUsernameExists_shouldReturnError() {

	    UserCreateRequest req = new UserCreateRequest();
	    req.setUsername("ravi");
	    req.setEmail("ravi@gmail.com");

	    Mockito.when(repo.existsByUsername("ravi")).thenReturn(true);

	    Map<String, Object> response = service.createUser(req);

	    assertEquals(Constants.StatusCode.error, response.get("statusCode"));
	    assertEquals("Username already exists!", response.get("message"));

	    Mockito.verify(repo, Mockito.never()).save(Mockito.any());
	}
	
	@Test
	void createUser_whenEmailExists_shouldReturnError() {

	    UserCreateRequest req = new UserCreateRequest();
	    req.setUsername("ravi");
	    req.setEmail("ravi@gmail.com");

	    Mockito.when(repo.existsByUsername("ravi")).thenReturn(false);

	    Mockito.when(repo.existsByEmail("ravi@gmail.com")).thenReturn(true);

	    Map<String, Object> response = service.createUser(req);

	    assertEquals(Constants.StatusCode.error, response.get("statusCode"));
	    assertEquals("Email already exists!", response.get("message"));

	    Mockito.verify(repo, Mockito.never()).save(Mockito.any());
	}

	@Test
	void createUser_whenValidRequest_shouldCreateUser() {

	    UserCreateRequest req = new UserCreateRequest();
	    req.setUsername("ravi");
	    req.setEmail("ravi@gmail.com");
	    req.setMobile("9876543210");
	    req.setPassword("test123");

	    Mockito.when(repo.existsByUsername("ravi")).thenReturn(false);
	    Mockito.when(repo.existsByEmail("ravi@gmail.com")).thenReturn(false);

	    Mockito.when(repo.save(Mockito.any(UserMaster.class))).thenAnswer(inv -> inv.getArgument(0));

	    Map<String, Object> response = service.createUser(req);

	    assertEquals(Constants.StatusCode.success, response.get("statusCode"));
	    assertEquals("User created successfully!", response.get("message"));

	    UserMaster user = (UserMaster) response.get("data");
	    assertEquals("ravi", user.getUsername());
	}

}
