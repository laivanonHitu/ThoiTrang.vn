package com.Trangsuc.vn.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import ProductDTO.ProductDTO;

@Repository
public class ProductDAO extends baseDAO{
	
	public int deleteProduct(int id) {
		int delete;
		String deleteQuery = "DELETE FROM products WHERE id = ?";
		delete =  _jdbcTemplate.update(deleteQuery, id);
		return delete;
	}

	
}
