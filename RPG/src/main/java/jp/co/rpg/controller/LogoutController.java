package jp.co.rpg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

	@Autowired
	HttpSession session;

	//ログイン→ホーム
	@RequestMapping("/logout")
	public String home() {
		session.invalidate();
		return "index";
	}


}
