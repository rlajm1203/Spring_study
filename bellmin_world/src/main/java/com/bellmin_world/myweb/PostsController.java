<<<<<<< HEAD
package com.bellmin_world.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/posts")
@Log4j
public class PostsController {

	@GetMapping("")
	public String main() {
		log.info("Post Page");
		return "posts/posts";
	}
}
=======
package com.bellmin_world.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/posts")
@Log4j
public class PostsController {

	@GetMapping("")
	public String main() {
		log.info("Post Page");
		return "posts/posts";
	}
}
>>>>>>> 6ae5e3c224bdb78ebb2714d8314840489fe55f68
