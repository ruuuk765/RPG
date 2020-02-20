<<<<<<< HEAD
package jp.co.rpg.dao;

import java.util.List;

import jp.co.rpg.entity.Lv;
import jp.co.rpg.entity.User;

public interface LvDao {

	public List<Lv> getAll();

	List<Lv> lvCheck(User user);

}
