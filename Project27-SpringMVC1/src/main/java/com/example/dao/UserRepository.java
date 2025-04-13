package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
@Transactional
public class UserRepository {

	@PersistenceContext
	private EntityManager entityManager;

	// Save or Update User
	public void saveOrUpdate(User user) {
		if (user.getId() == 0) {
			entityManager.persist(user);
		} else {
			entityManager.merge(user);
		}
	}

	// Get all users
	public List<User> getAllUsers() {
		return entityManager.createQuery("from User", User.class).getResultList();
	}

	// Get user by ID
	public User getUserById(int id) {
		return entityManager.find(User.class, id);
	}

	// Delete user by ID
	public void deleteUser(int id) {
		User user = getUserById(id);
		if (user != null) {
			entityManager.remove(user);
		}
	}

	// Search user by name
	public List<User> searchUsers(String name) {
		String query = "SELECT u FROM User u WHERE LOWER(u.name) LIKE :name";
		return entityManager.createQuery(query, User.class).setParameter("name", "%" + name.toLowerCase() + "%")
				.getResultList();
	}

}
