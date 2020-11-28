package com.Trangsuc.vn.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class decriptionDAOProduct extends baseDAO {
	
	
	public String edit_decription_product( String col1,String col2) {
		String sql = "INSERT INTO decription_product (decription, short_decripton) VALUE("+col1+","+" " + col2 + ")";
		return sql;
	}
}
