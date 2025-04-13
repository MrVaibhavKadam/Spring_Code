package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.entity.UserPhoto;

@Repository
public class UserPhotoDaoImpl implements UserPhotoDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void save(UserPhoto userPhoto) {
		entityManager.persist(userPhoto);
	}

}
