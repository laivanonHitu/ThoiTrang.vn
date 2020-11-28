package com.Trangsuc.vn.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUser implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setAccount(rs.getString("account"));
		user.setPassword(rs.getString("password"));
		user.setUser_name(rs.getString("user_name"));
		user.setPhone_number(rs.getString("phone_number"));
		user.setEmail_address(rs.getString("email_address"));
		return user;
	}

}
