package com.Trangsuc.vn.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Trangsuc.vn.Entity.MapperMenu;
import com.Trangsuc.vn.Entity.Menu;
@Repository
public class menuDAO extends baseDAO {
	
	public List<Menu> getAllMenu() {
		List<Menu> listMenu = new ArrayList<>();
		String sql = "select * from menu";
		listMenu = (List<Menu>) _jdbcTemplate.query(sql, new MapperMenu());
		return listMenu;
	}
}
