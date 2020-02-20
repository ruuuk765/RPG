package jp.co.rpg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.rpg.entity.BattleInfo;
import jp.co.rpg.entity.Enemy;
import jp.co.rpg.entity.User;

@RestController
@ResponseBody
public class BattleCommandAttack{
	@Autowired
	HttpSession session;

	//ごうげき
	@RequestMapping("/attack")
	public BattleInfo Attack() {

		//ユーザーと敵の情報取得
		User user = (User) session.getAttribute("user");
		Enemy enemy = (Enemy) session.getAttribute("enemy");

		BattleInfo bi = new BattleInfo();

		if(user.getSpeed() >= enemy.getSpeed()) {
			if(user.battleCalc(bi, enemy)) {
				enemy.battleCalc(bi, user);
			}
		}else {
			if(enemy.battleCalc(bi, user)) {
				user.battleCalc(bi, enemy);
			}
		}
		session.setAttribute("user", user);
		bi.setUser(user);
		return bi;
	}
}


