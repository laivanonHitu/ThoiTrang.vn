package com.Trangsuc.vn.Service;

import java.util.List;

import ProductDTO.ProductDTO;

public interface IcategoryService {
	List<ProductDTO> getDataProductsById(int id);
	List<ProductDTO> getDataProductsPaginate(int start, int end);
}
