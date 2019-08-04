package com.muhammad.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if (count == null) {
			count = 0;
		}
		session.setAttribute("count", (count + 1));
		return "Home.jsp";
	}
	@RequestMapping("/count")
	public String count() {
		return "Count.jsp";
	}
}
