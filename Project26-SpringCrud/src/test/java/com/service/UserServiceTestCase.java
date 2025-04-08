package com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.bean.User;
import com.dao.UserDao;

@ExtendWith(MockitoExtension.class)
public class UserServiceTestCase {

	@InjectMocks
	private UserService userService;

	@Mock
	private UserDao userDao;

	@Test
	public void testGetUser() {
		User mockUser = new User(1, "Vaibhav", "vaibhav@gmail.com");

		when(userDao.getUserById(1)).thenReturn(mockUser);

		User result = userService.getUserById(1);

		assertEquals("Vaibhav", result.getName());
	}

}
