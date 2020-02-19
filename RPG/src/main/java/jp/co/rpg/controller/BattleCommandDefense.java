package jp.co.rpg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.rpg.dao.EnemyDao;
import jp.co.rpg.entity.BattleInfo;
import jp.co.rpg.entity.Enemy;
import jp.co.rpg.entity.User;

@RestController
@ResponseBody
public class BattleCommandDefense{
	@Autowired
	HttpSession session;
	@Autowired
	private EnemyDao enemyDao;

	//ぼうぎょ
	@RequestMapping("/defense")
	public BattleInfo defense() {

		//ユーザーと敵の情報取得
		User user = (User) session.getAttribute("user");
		Enemy enemy = (Enemy) session.getAttribute("enemy");


		BattleInfo bi = new BattleInfo();
		bi.setContext(user.getName()+"の攻撃");
		bi.setContext(enemy.getName()+"に"+user.getPower()+"のダメージを与えた");

		return bi;
	}
}
