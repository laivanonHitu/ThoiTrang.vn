package com.Trangsuc.vn.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSlide implements RowMapper<Slide> {

	@Override
	public Slide mapRow(ResultSet rs, int rowNum) throws SQLException {
		Slide slide = new Slide();
		slide.setId(rs.getInt("id"));
		slide.setDiscount(rs.getDouble("discount"));
		slide.setTitle(rs.getString("title"));
		slide.setContent(rs.getString("content"));
		slide.setImage(rs.getString("image"));
		return slide;
	}

}
