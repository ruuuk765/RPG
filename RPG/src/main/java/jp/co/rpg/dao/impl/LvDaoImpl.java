package jp.co.rpg.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.rpg.dao.LvDao;
import jp.co.rpg.entity.Lv;

@Repository
public class LvDaoImpl implements LvDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Lv> getAll() {
		 return jdbcTemplate.query("SELECT * FROM lv ORDER BY id", new BeanPropertyRowMapper<Lv>(Lv.class));
	}

	@Override
	public Lv lvCheck (Integer xp) {

		String SQL_LV_CHECK = "SELECT * FROM lv WHERE need_xp <= :xp ORDER BY lv DESC LIMIT 1";

		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("xp", xp);

		List<Lv> list = new ArrayList<Lv>();
		list = jdbcTemplate.query(SQL_LV_CHECK, param, new BeanPropertyRowMapper<Lv>(Lv.class));

		return list.get(0);
	}
}
