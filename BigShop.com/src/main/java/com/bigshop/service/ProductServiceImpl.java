package com.bigshop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigshop.dao.ProductDAO;
import com.bigshop.entity.Post;
import com.bigshop.entity.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDAO productDAO;

	@Override
	public void save(Product product) {
		this.productDAO.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		return this.productDAO.getAllProduct();
	}

	@Override
	public void updatePost(Product product) {

	}

	@Override
	public void deleteProduct(int id) {
		this.productDAO.deleteProduct(id);
	}

	@Override
	public Post getPostById(int id) {
		return null;
	}

}
