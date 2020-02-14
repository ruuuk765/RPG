package jp.co.rpg.dao;

import java.util.List;

import jp.co.rpg.entity.User;

public interface UserDao {

	public void createAccount(User user);
	public List<User> find(User user);


}
