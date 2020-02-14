package jp.co.rpg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.rpg.controller.form.CreateAccountForm;
import jp.co.rpg.entity.User;
import jp.co.rpg.service.CreateAccountService;

@Controller
public class CreateAccountController {

	@Autowired
	CreateAccountService service;
	@Autowired
	HttpSession session;

	@RequestMapping("/createAccountPage")
	public String createAccountPage() {
		return "createAccountPage";
	}

	@RequestMapping(value="/confirm", method=RequestMethod.POST)
	public String confirm(@Validated @ModelAttribute("test") CreateAccountForm form,
	BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
		 model.addAttribute("msg", "入力に誤りがあります");
		 return "createAccountPage";
		}

		User user = new User();
		user.setUserId(form.getUserId());
		user.setPassword(form.getPassword());
		user.setName(form.getName());
		user.setRoleId(form.getRoleId());

//		IDの重複check
		if(service.idCheck(form.getUserId())) {
			model.addAttribute("msg1", "そのIDはつかわれています");
			return "createAccountPage";
		}

//		passwordの確認
		if((form.getPassword()).equals(form.getPasswordCheck())) {
			model.addAttribute("msg2", "あんごうとあんごうかくにんがいっちしません");
			return "createAccountPage";
		}

//		セッションにUer型の情報を保存
		session.setAttribute("user", user);
		return "confirm";
	}

	@RequestMapping(value="/createAccount", method=RequestMethod.POST)
	public String createAccount(@Validated @ModelAttribute("test") CreateAccountForm form,
	BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
		 model.addAttribute("msg", "入力に誤りがあります");
		 return "createAccountPage";
		}

//		TODO CreateAccountServiceを使って登録
		User user = new User();
		user = (User)session.getAttribute("user");
		service.createAccount(user);

		return "home";
	}

}
