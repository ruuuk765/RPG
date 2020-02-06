package jp.co.rpg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MockController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/input")
	public String input() {
		return "input";
	}

	@RequestMapping("/selectRole")
	public String selectRole() {
		return "selectRole";
	}

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/changeRole")
	public String changeRole() {
		return "changeRole";
	}

	@RequestMapping("/battle")
	public String battle() {
		return "battle";
	}
}
