package com.Trangsuc.vn.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperProduct implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product = new Product();
		product.setId(rs.getInt("id"));
		product.setId_category(rs.getInt("id_category"));
		product.setSizes(rs.getString("sizes"));
		product.setName(rs.getString("name"));
		product.setPrice(rs.getDouble("price"));
		product.setSale(rs.getDouble("sale"));
		product.setTitle(rs.getString("title"));
		product.setHighlight(rs.getBoolean("highlight"));
		product.setNew_product(rs.getBoolean("new_product"));
		product.setDetails(rs.getString("details"));
		product.setCreated_at(rs.getTimestamp("created_at"));
		product.setUpdated_at(rs.getTimestamp("updated_at"));
		return product;
	}

}
