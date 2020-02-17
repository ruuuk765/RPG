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

//制作日：2020.02.14
//制作者：新垣
@Controller
public class CreateAccountController {

	@Autowired
	CreateAccountService service;
	@Autowired
	HttpSession session;

//	idex.jsp
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

//	idex.jsp - regist.jsp
	@RequestMapping("/regist")
	public String createAccountPage(@Validated @ModelAttribute("test") CreateAccountForm form,
			BindingResult bindingResult, Model model) {
		model.addAttribute("list", service.getAll());
		return "regist";
	}

//	regist.jsp - confirm.jsp
	@RequestMapping(value="/confirm", method=RequestMethod.POST)
	public String confirm(@Validated @ModelAttribute("test") CreateAccountForm form,
	BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
		 model.addAttribute("msg", "入力に誤りがあります");
		 return "regist";
		}



//		IDの重複check
		if(service.idCheck(form.getUserId())) {
			model.addAttribute("msg1", "そのIDはつかわれています");
			return "regist";
		}

//		passwordの確認
		if((form.getPassword()).equals(form.getPasswordCheck())) {
			model.addAttribute("msg2", "あんごうとあんごうかくにんがいっちしません");
			return "regist";
		}

//		セッションにUer型の情報を保存
		User user = new User();
		user.setUserId(form.getUserId());
		user.setPassword(form.getPassword());
		user.setName(form.getName());
		user.setRoleId(form.getRoleId());
		session.setAttribute("user", user);
		return "confirm";
	}

//	confirm.jsp - home.jsp
	@RequestMapping(value="/createAccount", method=RequestMethod.POST)
	public String createAccount(@Validated @ModelAttribute("test") CreateAccountForm form,
	BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
		 model.addAttribute("msg", "入力に誤りがあります");
		 return "createAccountPage";
		}

//		CreateAccountServiceを使って登録
		User user = new User();
		user = (User)session.getAttribute("user");
		service.createAccount(user);

		return "home";
	}

}