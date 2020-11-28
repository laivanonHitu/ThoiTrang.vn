package com.Trangsuc.vn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trangsuc.vn.DAO.decriptionDAOProduct;

@Service
public class decriptionProductService {
	@Autowired(required = true)
	private decriptionDAOProduct decriptionDAOProduct;
	
	public String edit_decription_product(String col1, String col2) {
		return this.decriptionDAOProduct.edit_decription_product(col1, col2);
	}
}
