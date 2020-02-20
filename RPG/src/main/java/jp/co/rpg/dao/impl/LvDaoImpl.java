package jp.co.rpg.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import jp.co.rpg.dao.LvDao;
import jp.co.rpg.entity.Lv;
import jp.co.rpg.entity.Role;
import jp.co.rpg.entity.User;
import jp.co.rpg.util.Util;

public class LvDaoImpl implements LvDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Lv> getAll() {
		 return jdbcTemplate.query("SELECT * FROM lv ORDER BY id", new BeanPropertyRowMapper<Lv>(Lv.class));
	}

	@Override
	public List<lv> lvCheck (User user) {

		user.getXp()

	}
		String SQL_SELECT_FIND = "";
		StringBuilder forSearch = new StringBuilder("SELECT * FROM lv where 1 = 1");

		if(!(Util.isNullOrEmpty(role.getId()))) {
			forSearch.append(" AND id = :id");
		}
		if(!(Util.isNullOrEmpty(role.getName()))) {
			forSearch.append(" AND name = :name");
		}

		SQL_SELECT_FIND = forSearch.toString();

		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("id", role.getId());
		param.addValue("password", role.getName());

		List<Role> list = new ArrayList<Role>();
		list = jdbcTemplate.query(SQL_SELECT_FIND, param, new BeanPropertyRowMapper<Role>(Role.class));

		return list;

}
