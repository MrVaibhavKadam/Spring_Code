package com.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dao.UserPhotoDao;
import com.entity.UserPhoto;

@Service
public class UserPhotoServiceImpl implements UserPhotoService {

	@Autowired
	private UserPhotoDao userPhotoDao;

	private final String UPLOAD_DIR = "C:/Vaibhav Kadam/uploads/";

	@Override
	public void uploadPhoto(String name, MultipartFile file) throws IOException {
		String filePath = UPLOAD_DIR + file.getOriginalFilename();
		file.transferTo(new File(filePath));

		UserPhoto userPhoto = new UserPhoto();
		userPhoto.setName(name);
		userPhoto.setPhotoPath(filePath);
		userPhotoDao.save(userPhoto);

	}
}
