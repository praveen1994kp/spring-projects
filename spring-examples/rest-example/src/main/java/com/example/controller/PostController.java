package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Model;
import com.example.service.PostService;

@RestController
public class PostController {

	@Autowired
	private PostService service;

	@RequestMapping("/simplePost")
	public void simplePost(@RequestBody Model model) {
		service.simpleServiceWithPseudoErrors(model);
	}

}
