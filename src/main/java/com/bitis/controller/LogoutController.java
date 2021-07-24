package com.bitis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping(value = "/logout")
@SessionAttributes(names = "user")
public class LogoutController {

	@GetMapping
	public String logOut(WebRequest request, SessionStatus status) {
		
		status.setComplete();
	    request.removeAttribute("user", WebRequest.SCOPE_SESSION);
	    return "redirect:/trang-chu";
	}
	

}