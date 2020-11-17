package com.Trangsuc.vn.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Trangsuc.vn.Entity.MapperSlide;
import com.Trangsuc.vn.Entity.Slide;

@Repository
public class SlideDAO extends baseDAO {
	public List<Slide> getAllSlide() {
		List<Slide> listSlide = new ArrayList<>();
		String sql = "select * from slide";
		listSlide = _jdbcTemplate.query(sql, new MapperSlide());
		return listSlide;
	}

}
