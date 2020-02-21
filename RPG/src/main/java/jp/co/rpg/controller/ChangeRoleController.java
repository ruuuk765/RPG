package jp.co.rpg.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.rpg.dao.UserDao;
import jp.co.rpg.entity.Role;
import jp.co.rpg.entity.User;

@Controller
public class ChangeRoleController {
	@Autowired
	HttpSession session;
	@Autowired
	private UserDao userDao;

	//ホーム→てんしょく
	@RequestMapping("/changeRole")
	public String changeRole() {

		return "changeRole";
	}

	//てんしょく→ホーム(きまり)
	@RequestMapping(value = "/home", method = RequestMethod.POST, params="changeRole")
	public String home(@RequestParam("role")Integer roleId) {

		//roleIdを変更し、セッションとDBに保存
		User user = (User) session.getAttribute("user");
		List<Role> roleList = (List) session.getAttribute("roleList");
		user.setRoleId(roleId);
		Role role = roleList.get(user.getRole().getId()-1);
		userDao.update(user);
		session.setAttribute("role", role);
		session.setAttribute("user", user);

		return "home";
	}

	//てんしょく→ホーム(もどる)
	@RequestMapping(value = "/home", method = RequestMethod.GET, params="changeRole")
	public String getHome() {

		return "home";
	}
}
