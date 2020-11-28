package com.Trangsuc.vn.Service;

import java.util.List;

import com.Trangsuc.vn.Entity.Product;

import ProductDTO.ProductDTO;

public interface IProductService {
	 
	 public ProductDTO getProductById(int id);
	 
	 
	 public List<ProductDTO> getProductBanner();
	 
	 
	 public List<ProductDTO> getProductByCategory(int id);
	 
	 
	 public List<ProductDTO> getProductByIdCategory(int id);
	 
	 
	 public int delete(Integer id);
	 
	 public int sqlUpdateProduct(Product product);
}
