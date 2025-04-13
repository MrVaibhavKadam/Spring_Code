package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserRepository;
import com.example.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	// Create or Update user
	public void saveUser(User user) {
		userRepository.saveOrUpdate(user);
	}

	// Get all users
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}

	// Get single user by ID
	public User getUserById(int id) {
		return userRepository.getUserById(id);
	}

	// Delete user
	public void deleteUser(int id) {
		userRepository.deleteUser(id);
	}

	// search user
	public List<User> searchUsers(String name) {
		return userRepository.searchUsers(name);
	}
}
