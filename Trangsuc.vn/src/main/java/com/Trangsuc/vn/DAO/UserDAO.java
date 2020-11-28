package com.Trangsuc.vn.DAO;

import org.springframework.stereotype.Repository;

import com.Trangsuc.vn.Entity.MapperUser;
import com.Trangsuc.vn.Entity.User;

@Repository
public class UserDAO extends baseDAO {

	
	public int  addAccount(User user) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT ");
		sql.append("INTO USERS ");
		sql.append("( ");
		sql.append("	account, ");
		sql.append("	password, ");
		sql.append("	user_name, ");
		sql.append("	phone_number, ");
		sql.append("	email_address ");
		sql.append(") ");
		sql.append("VALUE ");
		sql.append("( ");
		sql.append("	'" + user.getAccount() + "', ");
		sql.append("	'" + user.getPassword() + "', ");
		sql.append("	'" + user.getUser_name() + "', ");
		sql.append("	'" + user.getPhone_number() + "', ");
		sql.append("	'" + user.getEmail_address() + "' ");
		sql.append(");");
		int insert  = _jdbcTemplate.update(sql.toString());
		return insert;
	}

	public User loginAccount(User user) {
		String sql = "select * from users AS u WHERE u.account = ' " + user.getUser_name() + "' ";
		user =  (User) _jdbcTemplate.query(sql, new MapperUser());
		return user;
	}

	
	
	
	

	
}
