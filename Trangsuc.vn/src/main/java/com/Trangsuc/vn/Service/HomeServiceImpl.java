package com.Trangsuc.vn.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trangsuc.vn.DAO.CategoryDAO;
import com.Trangsuc.vn.DAO.ProductDTO_DAO;
import com.Trangsuc.vn.DAO.SlideDAO;
import com.Trangsuc.vn.DAO.menuDAO;
import com.Trangsuc.vn.Entity.Categorys;
import com.Trangsuc.vn.Entity.Menu;
import com.Trangsuc.vn.Entity.Slide;

import ProductDTO.ProductDTO;

@Service
public class HomeServiceImpl implements HomeServiceI {
	@Autowired(required = true)
	private CategoryDAO categoryDAO;

	@Autowired(required = true)
	private SlideDAO slideDAO;

	@Autowired(required = true)
	private menuDAO menuDAO;
	
	@Autowired(required = true)
	private ProductDTO_DAO  productDAO;
	/*
	 * public void setCategoryDAO(CategoryDAO categoryDAO) { this.categoryDAO =
	 * categoryDAO; }
	 * 
	 * public void setSlideDAO(SlideDAO slideDAO) { this.slideDAO = slideDAO; }
	 */
	@Override
	public List<Categorys> getAllCategory() {
		return this.categoryDAO.getAllCategory();
	}

	@Override
	public List<Slide> getAllSlide() {

		return this.slideDAO.getAllSlide();
	}

	@Override
	public List<Menu> getAllMenu() {
		return this.menuDAO.getAllMenu();
	}

	@Override
	public List<ProductDTO> getAllProduct() {
		return this.productDAO.getAllProduct();
	}
}
