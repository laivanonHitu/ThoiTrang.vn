package com.Trangsuc.vn.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trangsuc.vn.DAO.ProductDTO_DAO;

@Service
public class InsertProductsImpl implements InsertProducts {
	@Autowired
	private ProductDTO_DAO productDTO_DAO;

	@Override
	public String insertProduct() {
		return this.productDTO_DAO.insertProduct();
	}

	@Override
	public String insertProduct1() {
		return this.productDTO_DAO.insertProduct1();
	}

}
