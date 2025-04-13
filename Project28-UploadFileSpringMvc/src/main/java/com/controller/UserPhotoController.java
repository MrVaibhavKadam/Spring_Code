package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.service.UserPhotoService;

@Controller
public class UserPhotoController {

	@Autowired
	private UserPhotoService userPhotoService;

	@PostMapping("/upload")
	public ResponseEntity<String> handleUpload(
			@RequestParam("name") String name,
			@RequestParam("file") MultipartFile file) {
		try {
			userPhotoService.uploadPhoto(name, file);
		}
	}
}
