package com.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface UserPhotoService {

	void uploadPhoto(String name, MultipartFile file) throws IOException;
}
