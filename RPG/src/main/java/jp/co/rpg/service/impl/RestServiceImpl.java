package jp.co.rpg.service.impl;

import org.springframework.stereotype.Service;

import jp.co.rpg.entity.User;
import jp.co.rpg.service.RestService;

@Service
public class RestServiceImpl implements RestService {

	private final Integer restPrice = 50;

	@Override
	public Boolean rest(User user) {

		if(user.getGold() >= restPrice) {
			user.setHp(user.getMaxHp());
			user.setMp(user.getMaxMp());
			user.setGold(((user.getGold())-restPrice));
			return true;
		}
		return false;
	}

}

