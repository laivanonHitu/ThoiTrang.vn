package com.bigshop.service;

import java.util.List;

import com.bigshop.entity.Post;
import com.bigshop.entity.Product;

public interface ProductService {
	public void save(Product product);
	public List<Product> getAllProduct();
	public void updatePost(Product product);
	public void deleteProduct(int id);
	public Post getPostById(int id);
}
