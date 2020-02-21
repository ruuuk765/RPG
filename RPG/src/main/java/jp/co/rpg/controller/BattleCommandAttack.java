package jp.co.rpg.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jp.co.rpg.entity.BattleInfo;
import jp.co.rpg.entity.Enemy;
import jp.co.rpg.entity.Lv;
import jp.co.rpg.entity.Magic;
import jp.co.rpg.entity.User;

@RestController
@ResponseBody
public class BattleCommandAttack{
	@Autowired
	HttpSession session;

//	レベルアップ乱数調整
	private static final Integer maxHpUpRate = 5;
	private static final Integer maxMpUpRate = 5;
	private static final Integer powerUpRate = 5;
	private static final Integer intelligenceUpRate = 5;
	private static final Integer defenseUpRate = 5;
	private static final Integer speedUpRate = 5;


	//ごうげき
	@RequestMapping("/attack")
	public BattleInfo Attack(@RequestParam("magicId")Integer magicId) {

		//ユーザーと敵の情報取得
		User user = (User) session.getAttribute("user");
		Enemy enemy = (Enemy) session.getAttribute("enemy");
		BattleInfo bi = new BattleInfo();

		//まほうが選択された場合
		if(magicId != 0) {
			bi.setIsMagic(true);
			List <Magic> magicList = (List) session.getAttribute("magicList");
			Magic magic = magicList.get(magicId);
			bi.setMagic(magic);
		}

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

//		レベルアップの確認
		Lv lv = (Lv) session.getAttribute("nextLv");
		if(lv.getNeedXp() <= user.getXp()) {
			Integer maxHpUp = (int) (Math.random() * 3 + 8) * maxHpUpRate;
			Integer maxMpUp = (int) (Math.random() * 3 + 8) * maxMpUpRate;
			Integer powerUp = (int) (Math.random() * 3 + 8) * powerUpRate;
			Integer intelligenceUp = (int) (Math.random() * 3 + 8) * intelligenceUpRate;
			Integer defenseUp = (int) (Math.random() * 3 + 8) * defenseUpRate;
			Integer speedUp = (int) (Math.random() * 3 + 8) * speedUpRate;

			user.setLv(lv.getLv());
			user.setXp(lv.getNeedXp());
			user.setMaxHp(user.getMaxHp() + maxHpUp);
			user.setMaxMp(user.getMaxMp() + maxMpUp);
			user.setPower(user.getPower() + powerUp);
			user.setIntelligence(user.getIntelligence() + intelligenceUp);
			user.setDefense(user.getDefense() + defenseUp);
			user.setSpeed(user.getSpeed() + speedUp);

//			メッセージの格納
			bi.setContext(
					user.getName() + "は、" + user.getLv() + "レベルになった。" +
					"最大HPが" + maxHpUp + "増えた。" +
					"最大MPが" + maxMpUp + "増えた。" +
					"ちからが" + powerUp + "増えた。" +
					"ちりょくが" + intelligenceUp + "増えた。" +
					"ぼうぎょが" + defenseUp + "増えた。" +
					"はやさが" + speedUp + "増えた。"
					);
		}

		session.setAttribute("user", user);
		bi.setUser(user);
		return bi;
	}
}