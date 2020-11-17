package com.Trangsuc.vn.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategory implements RowMapper<Categorys> {

	@Override
	public Categorys mapRow(ResultSet rs, int rowNum) throws SQLException {
		Categorys cat = new Categorys();
		cat.setId(rs.getInt("id"));
		cat.setCategory_name(rs.getString("category_name"));
		cat.setStatus(rs.getString("status"));
		cat.setImage(rs.getString("image"));
		cat.setId_product(rs.getInt("id_product"));
		return cat;
	}
	
}
