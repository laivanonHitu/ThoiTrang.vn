package com.Trangsuc.vn.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ProductDTO.ProductDTO;

public class MapperProductDTO implements RowMapper<ProductDTO> {

	@Override
	public ProductDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ProductDTO pDTO = new ProductDTO();
		pDTO.setId_product(rs.getInt("id_product"));

		pDTO.setId_category(rs.getInt("id_category"));

		pDTO.setSizes(rs.getString("sizes"));

		pDTO.setName(rs.getString("name"));
		pDTO.setPrice(rs.getDouble("price"));

		pDTO.setSale(rs.getDouble("sale"));

		pDTO.setTitle(rs.getString("title"));
		//
		pDTO.setHighlight(rs.getBoolean("highlight"));

		pDTO.setNew_product(rs.getBoolean("new_product"));
		pDTO.setDetails(rs.getString("details"));

		pDTO.setId_color(rs.getInt("id_color"));

		pDTO.setName_color(rs.getString("name_color"));

		pDTO.setCode_color(rs.getString("code_color"));

		pDTO.setImg(rs.getString("img"));

		pDTO.setCreated_at(rs.getTimestamp("created_at"));

		pDTO.setUpdated_at(rs.getTimestamp("updated_at"));

		return pDTO;
	}

}
