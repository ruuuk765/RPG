package jp.co.rpg.service;

import jp.co.rpg.entity.User;

public interface CreateAccountService {

//	 新規アカウントの初期値フィールドを作成
	Integer lv = 1;
	Integer maxHp = 30;
	Integer hp = 30;
	Integer maxMp = 20;
	Integer mp = 20;
	Integer power = 5;
	Integer intelligence = 5;
	Integer defense = 5;
	Integer speed = 5;
	Integer xp = 0;
	Integer gold = 0;
	Integer sinceDays = 0;
	Integer adminFlg = 0;
	Integer clearFlg = 0;
	Integer deleteFlg = 0;

//  IDの重複check
	public boolean idCheck(String userId);


//	 UserDaoを使って新しいアカウントを作成
	public void createAccount(User user);








}
