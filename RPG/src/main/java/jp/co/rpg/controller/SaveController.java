package jp.co.rpg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rpg.entity.User;

@Controller
public class SaveController {
	@Autowired
	HttpSession session;

	@RequestMapping("/save")
	public void index() {
		User user = (User) session.getAttribute("User");
	}
}