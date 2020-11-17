package com.Trangsuc.vn.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class baseDAO {
	@Autowired
	public JdbcTemplate _jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this._jdbcTemplate = jdbcTemplate;
	}
}
