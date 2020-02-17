package jp.co.rpg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MockController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
//
//	@RequestMapping("/regist")
//	public String regist() {
//		return "regist";
//	}
//	@RequestMapping("/test")
//	public String test() {
//		return "registConfirm";
//	}

//	@RequestMapping("/login")
//	public String login() {
//		return "login";
//	}

//	@RequestMapping("/selectRole")
//	public String selectRole() {
//		return "selectRole";
//	}
////
//	@RequestMapping("/home")
//	public String home() {
//		return "home";
//	}

//	@RequestMapping("/changeRole")
//	public String changeRole() {
//		return "changeRole";
//	}
//
//	@RequestMapping("/battle")
//	public String battle() {
//		return "battle";
//	}
}
