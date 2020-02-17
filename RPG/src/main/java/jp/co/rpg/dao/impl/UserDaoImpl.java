package jp.co.rpg.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.rpg.dao.UserDao;
import jp.co.rpg.entity.User;
import jp.co.rpg.util.Util;

//制作日：2020.02.14
//制作者：新垣
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	String SQL_CREATE_ACCOUNT = "INSERT INTO users VALUE ("
			+ "(SELECT MAX(id) + 1 FROM users), "
			+ ":userId, :password, :name, :roleId, "
			+ ":lv, :maxHp, :hp, :maxMp, :mp, :power, :intelligence, :defense, :speed, "
			+ ":xp, :gold, :sinceDays, "
			+ "current_date, current_date, "
			+ ":adminFlg, :clearFlg, :deleteFlg)";

	@Override
	public void createAccount(User user) {
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("userId", user.getUserId());

		jdbcTemplate.update(SQL_CREATE_ACCOUNT, param);

	}

	@Override
	public List<User> find(User user) {
		String SQL_SELECT_FIND = "";
		StringBuilder forSearch = new StringBuilder("SELECT * FROM users where 1 = 1");

		if(!(Util.isNullOrEmpty(user.getUserId()))) {
			forSearch.append(" AND user_id = :userId");
		}
		if(!(Util.isNullOrEmpty(user.getPassword()))) {
			forSearch.append(" AND password = :password");
		}

		SQL_SELECT_FIND = forSearch.toString();

		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("userId", user.getUserId());
		param.addValue("password", user.getPassword());

		List<User> list = new ArrayList<User>();
		list = jdbcTemplate.query(
			SQL_SELECT_FIND,
			param,
			new BeanPropertyRowMapper<User>(User.class));

		return list;
	}

}
