package jp.co.rpg.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import jp.co.rpg.dao.LvDao;
import jp.co.rpg.entity.Lv;
import jp.co.rpg.entity.User;

public class LvDaoImpl implements LvDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Lv> getAll() {
		 return jdbcTemplate.query("SELECT * FROM lv ORDER BY id", new BeanPropertyRowMapper<Lv>(Lv.class));
	}

	@Override
	public List<Lv> lvCheck (User user) {

		String SQL_LV_CHECK = "SELECT * FROM lv WHERE need_xp < :xp";

		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("xp", user.getXp());

		List<Lv> list = new ArrayList<Lv>();
		list = jdbcTemplate.query(SQL_LV_CHECK, param, new BeanPropertyRowMapper<Lv>(Lv.class));

		return list;
	}
}
