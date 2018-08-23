package com.restful05.restapi05;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Welcome welcome welcome";
	}

}
