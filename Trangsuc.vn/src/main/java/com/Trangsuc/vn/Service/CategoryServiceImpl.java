package com.Trangsuc.vn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trangsuc.vn.DAO.ProductDTO_DAO;

import ProductDTO.ProductDTO;

@Service
public class CategoryServiceImpl implements IcategoryService  {
	@Autowired(required = true)
	private ProductDTO_DAO productDAO;
	
	@Override
	public List<ProductDTO> getDataProductsById(int id) {

		return this.productDAO.getAllProductById(id);
	}

	@Override
	public List<ProductDTO> getDataProductsPaginate(int start, int end) {
		return this.productDAO.getPaginatesDto(start, end);
	}

}
