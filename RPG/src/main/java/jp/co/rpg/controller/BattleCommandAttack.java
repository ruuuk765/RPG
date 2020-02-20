package jp.co.rpg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public BattleInfo Attack(@RequestParam("magicId")Integer magicId) {

		//ユーザーと敵の情報取得
		User user = (User) session.getAttribute("user");
		Enemy enemy = (Enemy) session.getAttribute("enemy");

		BattleInfo bi = new BattleInfo();

		//まほうが選択された場合
		if(magicId != 0)
			bi.setIsMagic(true);

		//スピードチェック
		if(user.getSpeed() >= enemy.getSpeed()) {
			//ユーザー先攻
			if(user.battleCalc(bi, enemy)) {
				bi.setIsMagic(false);
				enemy.battleCalc(bi, user);
			}
		}else {
			//ユーザー後攻
			boolean temp = bi.getIsMagic();
			bi.setIsMagic(false);
			if(enemy.battleCalc(bi, user)) {
				bi.setIsMagic(temp);
				user.battleCalc(bi, enemy);
			}
		}
		session.setAttribute("user", user);
		bi.setUser(user);
		return bi;
	}
}