package com.web.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@PostMapping("/handle_login")
	public ModelAndView processLogin() {
		ModelAndView mav = new ModelAndView("web/home");
		return mav;
	}
}
