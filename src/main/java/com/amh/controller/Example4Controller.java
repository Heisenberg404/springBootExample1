package com.amh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amh.model.Person;

@Controller
@RequestMapping("/example4")
public class Example4Controller {
	
	public static final String VIEW_404 = "404";
	
	@GetMapping("/show404")
	 public String show404(){
		 return VIEW_404;
	 }

}
