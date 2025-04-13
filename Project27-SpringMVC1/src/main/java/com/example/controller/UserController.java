package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*") // Allow frontend (Vite) access
public class UserController {

	@Autowired
	private UserService userService;

	// Get all users
	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	// Get user by ID
	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUserById(id);
	}

	// Search user
	@GetMapping("/search")
	public List<User> searchUser(@RequestParam(required = false) String name) {

		List<User> result = userService.searchUsers(name);
		return result;
	}

	// Add user
	@PostMapping
	public String createUser(@RequestBody User user) {
		userService.saveUser(user);
		return "User added successfully";
	}

	// Update user
	@PutMapping("/{id}")
	public String updateUser(@PathVariable int id, @RequestBody User user) {
		user.setId(id);
		userService.saveUser(user);
		return "User updated successfully";
	}

	// Delete user
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
		return "User deleted successfully";
	}
}
