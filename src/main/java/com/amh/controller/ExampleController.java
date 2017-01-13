package com.amh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.amh.component.ExampleComponent;
import com.amh.service.ExampleService;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	public static final String EXAMPLE_VIEW = "example";
	
	@Autowired
	@Qualifier("exampleService")
	private ExampleService exampleService;
	
	@Autowired
	@Qualifier("exampleComponent")
	private ExampleComponent exampleComponent;
	
	//@RequestMapping(value="/exampleString", method=RequestMethod.GET)
	@GetMapping("/exampleString")
	public String exampleString(Model model){
//		model.addAttribute("person", new Person("Josele", 23));
		model.addAttribute("people", exampleService.getListPeople());
		exampleComponent.sayHello();
		return EXAMPLE_VIEW;
	}
	
	//@RequestMapping(value="/exampleMAV", method=RequestMethod.GET)
	@GetMapping("/exampleMAV")
	public ModelAndView exampleMAV(){
		ModelAndView modelAndView = new ModelAndView(EXAMPLE_VIEW);
		modelAndView.addObject("people", exampleService.getListPeople());
		return modelAndView;
	}
	
	
}
