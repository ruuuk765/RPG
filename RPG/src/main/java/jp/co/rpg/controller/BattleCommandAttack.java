package jp.co.rpg.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.rpg.dao.EnemyDao;
import jp.co.rpg.entity.BattleInfo;
import jp.co.rpg.entity.Chara;
import jp.co.rpg.entity.Enemy;
import jp.co.rpg.entity.User;

@RestController
@ResponseBody
public class BattleCommandAttack{
	@Autowired
	HttpSession session;
	@Autowired
	private EnemyDao enemyDao;

	//ごうげき
	@RequestMapping("/attack")
	public BattleInfo Attack() {

		BattleInfo bi = new BattleInfo();

		//ユーザーと敵の情報取得
		User user = (User) session.getAttribute("user");
		Enemy enemy = (Enemy) session.getAttribute("enemy");

//		スピードの比較
		if(user.getSpeed() >= enemy.getSpeed()) {

		}else {

		}

		session.setAttribute("user", user);
		session.setAttribute("enemy", enemy);

		return bi;
	}

//ダメージ計算
	private BattleInfo damageCalc(Chara first, Chara second) {
		BattleInfo bi = new BattleInfo();

		Integer fhp = first.getHp();
		Integer fdef = first.getDefense();
		Integer fatk = first.getPower();
		Integer shp = second.getHp();
		Integer sdef = second.getDefense();
		Integer satk = second.getPower();

//		先攻処理
		shp = shp - (fatk - sdef);
		first.setHp(fhp);
		second.setHp(shp);

//		続行の確認
		if(shp <= 0) {
			if(first instanceof User) {
				bi.setUser((User)first);
				bi.setEnemy((Enemy)second);
				bi.setStatus("win");
				return bi;
			}else {
				bi.setEnemy((Enemy)first);
				bi.setUser((User)second);
				bi.setStatus("lose");
				return bi;
			}
		}

//		後攻処理
		fhp = fhp - (satk - fdef);
		first.setHp(fhp);
		second.setHp(shp);

//		続行の確認
		if(fhp <= 0) {
			if(first instanceof User) {
				bi.setUser((User)first);
				bi.setEnemy((Enemy)second);
				bi.setStatus("lose");
				return bi;
			}else {
				bi.setEnemy((Enemy)first);
				bi.setUser((User)second);
				bi.setStatus("win");
				return bi;
			}

		if(first instanceof User) {
			bi.setUser((User)first);
			bi.setEnemy((Enemy)second);
			bi.setStatus("lose");
			return bi;
		}else {
			bi.setEnemy((Enemy)first);
			bi.setUser((User)second);
			bi.setStatus("win");
			return bi;


		}

	}

}


