package jp.co.rpg.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jp.co.rpg.dao.RoleDao;
import jp.co.rpg.entity.Role;

@Repository
public class RoleDaoImpl implements RoleDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Role> getAll() {
		 return jdbcTemplate.query("SELECT * FROM roles ORDER BY id", new BeanPropertyRowMapper<Role>(Role.class));
	}

}
