package com.example.service;

import org.springframework.stereotype.Service;

import com.example.models.Model;

@Service
public class PostServiceImpl implements PostService {

	@Override
	public void simpleServiceWithPseudoErrors(Model model) {
		if (Math.random() <= 0.7) {
			throw new RuntimeException("Exception Has Occured");
		}
	}

}
