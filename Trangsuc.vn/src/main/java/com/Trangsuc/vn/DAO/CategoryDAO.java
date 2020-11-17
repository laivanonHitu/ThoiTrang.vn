package com.Trangsuc.vn.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Trangsuc.vn.Entity.Categorys;
import com.Trangsuc.vn.Entity.MapperCategory;

@Repository
public class CategoryDAO extends baseDAO {

	public List<Categorys> getAllCategory() {
		List<Categorys> listSlide = new ArrayList<>();
		String sql = "select * from category";
		listSlide = _jdbcTemplate.query(sql, new MapperCategory());
		return listSlide;
	}
}
