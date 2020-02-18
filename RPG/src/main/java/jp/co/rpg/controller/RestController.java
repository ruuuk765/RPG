package jp.co.rpg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rpg.entity.User;
import jp.co.rpg.service.RestService;

@Controller
public class RestController {

	@Autowired
	HttpSession session;
	@Autowired
	RestService service;

	User user = new User();


	@RequestMapping("/rest")
	public String rest() {

		user = (User) session.getAttribute("user");

		Boolean result = service.rest(user);

		if(result) {
			return "rest";
		}
		return "home";

	}
}
