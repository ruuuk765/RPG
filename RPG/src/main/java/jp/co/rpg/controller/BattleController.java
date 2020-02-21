package jp.co.rpg.controller;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jp.co.rpg.dao.EnemyDao;
import jp.co.rpg.dao.MagicDao;
import jp.co.rpg.entity.Enemy;
import jp.co.rpg.entity.Magic;
import jp.co.rpg.entity.Role;
import jp.co.rpg.entity.User;

@Controller
public class BattleController {
	@Autowired
	HttpSession session;
	@Autowired
	private EnemyDao enemyDao;
	@Autowired
	private MagicDao magicDao;

	//ホーム→せんとう(通常)
	@RequestMapping("/battle")
	public String Battle(@RequestParam("name")String enemyType) {

		//ユーザー情報取得
		User user = (User) session.getAttribute("user");
		Role role = (Role) session.getAttribute("role");
		Enemy enemy = new Enemy();

		if("usual".equals(enemyType)) {
			//出現LVがユーザーLV以下の敵データを取得
			List<Enemy> enemyList = enemyDao.findAppear(user);

			//乱数を用いてリストから出現する敵を選択
			Random random = new Random();
			enemy = enemyList.get(random.nextInt(enemyList.size()));
		}else {
			//ボスデータを取得
			enemy = enemyDao.findBoss().get(0);
		}
		session.setAttribute("enemy", enemy);

		//習得済み魔法取得（DAOやテーブルを含めて大幅に改善の必要あり）
		List<Magic> magicList = null;
		if(role.getId() == 2) {
			magicList = magicDao.findWizard();
		}else if(role.getId() == 3) {
			magicList = magicDao.findAll();
		}
		magicList.add(0, null);
		session.setAttribute("magicList", magicList);

		return "battle";
	}
}
