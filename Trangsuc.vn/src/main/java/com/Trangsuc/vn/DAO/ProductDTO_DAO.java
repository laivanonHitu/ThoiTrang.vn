package com.Trangsuc.vn.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Trangsuc.vn.Entity.MapperProductDTO;

import ProductDTO.ProductDTO;

@Repository
public class ProductDTO_DAO extends baseDAO {
	
	public List<ProductDTO> getAllProduct() {
		
		List<ProductDTO> listProduct = new ArrayList<>();
		StringBuffer  varname1 = new StringBuffer();
		varname1.append("SELECT ");
		varname1.append(" p.id as id_product ");
		varname1.append(" ");
		varname1.append(", p.id_category ");
		varname1.append(" ");
		varname1.append(", p.sizes ");
		varname1.append(" ");
		varname1.append(", p.name ");
		varname1.append(" ");
		varname1.append(", p.price ");
		varname1.append(" ");
		varname1.append(", p.sale ");
		varname1.append(" ");
		varname1.append(", p.title ");
		varname1.append(" ");
		varname1.append(", p.highlight ");
		varname1.append(" ");
		varname1.append(", p.new_product ");
		varname1.append(" ");
		varname1.append(", p.details ");
		varname1.append(" ");
		varname1.append(", c.id as id_color ");
		varname1.append(" ");
		varname1.append(", c.name as name_color ");
		varname1.append(" ");
		varname1.append(", c.code as code_color ");
		varname1.append(" ");
		varname1.append(", c.img ");
		varname1.append(" ");
		varname1.append(", p.created_at ");
		varname1.append(" ");
		varname1.append(", p.updated_at ");
		varname1.append(" ");
		varname1.append("FROM ");
		varname1.append(" ");
		varname1.append("products AS p ");
		varname1.append(" ");
		varname1.append("INNER JOIN ");
		varname1.append(" ");
		varname1.append("colors AS c ");
		varname1.append(" ");
		varname1.append("ON p.id = c.id_product ");
		varname1.append(" ");
		varname1.append("GROUP BY p.id, c.id_product ");
		varname1.append("limit 9");
		
		listProduct = _jdbcTemplate.query(varname1.toString(), new MapperProductDTO());
		return listProduct;
	}
	
}
