package com.demo.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.entities.User;
import com.demo.springboot.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/user")
@Tag(name="User API",description = "Operations related to User Management")
public class UserController {
	private static final Logger logger=LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService service;
	
	

	@GetMapping("/")
	@Operation(summary="find all Users")
	@ApiResponse(responseCode = "200",description = "Retrieves all the Users info")
	public List<User> findAll(){
		logger.info("Request to findAll Employees");
		return service.findAll();
	}
	
	@GetMapping("userId/{userId}")
	@Operation(summary="find user by id")
	@ApiResponses(value = {
		    @ApiResponse(responseCode = "200", description = "User found successfully"),
		    @ApiResponse(responseCode = "404", description = "User not found"),
		    @ApiResponse(responseCode = "400", description = "Invalid user ID supplied")
		})
	public User findById(@PathVariable Long userId) {
		logger.info("Request to find Employee by Id");
		return service.findById(userId);
	}
	
	@PostMapping("/")
	@Operation(summary="find all Users")
	@ApiResponse(responseCode = "200",description = "Saved the User info")
	public User save(@RequestBody User user) {
		logger.info("Request to save an Employee");
		return service.save(user);
	}
}