package com.Trangsuc.vn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trangsuc.vn.DAO.ProductDTO_DAO;
import com.Trangsuc.vn.Entity.Product;

import ProductDTO.ProductDTO;

@Service
public class productServiceImpl implements IProductService {
	@Autowired
	private ProductDTO_DAO productDTO_DAO;

	@Override
	public ProductDTO getProductById(int id) {

		List<ProductDTO> list = this.productDTO_DAO.getProductById(id);
		return list.get(0);
	}

	@Override
	public List<ProductDTO> getProductBanner() {
		return this.productDTO_DAO.getProductBanner();
	}

	@Override
	public List<ProductDTO> getProductByCategory(int id) {
		return this.productDTO_DAO.getProductByCategory(id);
	}

	@Override
	public int delete(Integer id) {
		return this.productDTO_DAO.delete(id);
	}

	@Override
	public int sqlUpdateProduct(Product product) {
		return this.productDTO_DAO.sqlUpdateProduct(product);
	}

	@Override
	public List<ProductDTO> getProductByIdCategory(int id) {
		return this.productDTO_DAO.getProductByIdCategory(id);
	}
}
