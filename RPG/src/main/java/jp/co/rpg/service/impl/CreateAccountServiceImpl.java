package jp.co.rpg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.co.rpg.dao.UserDao;
import jp.co.rpg.entity.User;
import jp.co.rpg.service.CreateAccountService;

@Service
public class CreateAccountServiceImpl implements CreateAccountService {

	@Autowired
	UserDao userDao;

	@Override
	public boolean idCheck(String userId) {
		User user = new User();
		user.setUserId(userId);
		if((userDao.find(user)).size() > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void createAccount(User user) {
//		entityUserに初期値フィールドをセット
		user.setLv(lv);
		user.setMaxHp(maxHp);
		user.setHp(hp);
		user.setMaxMp(maxMp);
		user.setMp(mp);
		user.setPower(power);
		user.setIntelligence(intelligence);
		user.setDefense(defense);
		user.setSpeed(speed);
		user.setXp(xp);
		user.setGold(gold);
		user.setSinceDays(sinceDays);
		user.setAdminFlg(adminFlg);
		user.setClearFlg(clearFlg);
		user.setDeleteFlg(deleteFlg);
		userDao.createAccount(user);

	}

}
