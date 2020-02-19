package jp.co.rpg.controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rpg.dao.EnemyDao;
import jp.co.rpg.entity.Enemy;
import jp.co.rpg.entity.User;

@Controller
public class BattleController {
	@Autowired
	HttpSession session;
	@Autowired
	private EnemyDao enemyDao;

	//ホーム→せんとう(通常)
	@RequestMapping("/battle")
	public String Battle() {

		//ユーザー情報取得
		User user = (User) session.getAttribute("user");

		//出現LVがユーザーLV以下の敵データを取得
		List<Enemy> enemyList = enemyDao.findAppear(user);

		//乱数を用いてリストから出現する敵を選択
		Random random = new Random();
		Enemy enemy = enemyList.get(random.nextInt(enemyList.size()));

		session.setAttribute("enemy", enemy);

		return "battle";
	}
}
