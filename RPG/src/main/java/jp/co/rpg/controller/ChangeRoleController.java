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

		Role oldRole = roleList.get(user.getRole().getId()-1);
		Role newRole = roleList.get(roleId -1);

		//前職業のステータス率を割り、新職業のステータス率を掛ける
		user.setPower((int)Math.round((double)(user.getPower() /oldRole.getPowerRate() * newRole.getPowerRate())));
		user.setIntelligence((int)Math.round((double)(user.getIntelligence() /oldRole.getIntelligenceRate()  * newRole.getIntelligenceRate())));
		user.setDefense((int)Math.round((double)(user.getDefense() /oldRole.getDefenceRate()  * newRole.getDefenceRate())));
		user.setSpeed((int)Math.round((double)(user.getSpeed() /oldRole.getSpeedRate()  * newRole.getSpeedRate())));

		user.setRoleId(roleId);
		userDao.update(user);
		session.setAttribute("role", newRole);
		session.setAttribute("user", user);

		return "home";
	}

	//てんしょく→ホーム(もどる)
	@RequestMapping(value = "/home", method = RequestMethod.GET, params="changeRole")
	public String getHome() {

		return "home";
	}
}
