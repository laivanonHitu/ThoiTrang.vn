package com.Trangsuc.vn.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class decriptionProductMapper implements RowMapper<decriptionProduct> {
	@Override
	public decriptionProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
		decriptionProduct decriptionProduct = new decriptionProduct();
		decriptionProduct.setId(rs.getInt("id"));
		decriptionProduct.setDecription(rs.getString("decription"));
		decriptionProduct.setShort_decripton(rs.getString("short_decripton"));
		decriptionProduct.setId_product(rs.getInt("id_product"));
		decriptionProduct.setId_product(rs.getInt("id_product"));
		decriptionProduct.setId_color(rs.getInt("id_color"));
		decriptionProduct.setId_category(rs.getInt("id_category"));
		return decriptionProduct;
	}
}
