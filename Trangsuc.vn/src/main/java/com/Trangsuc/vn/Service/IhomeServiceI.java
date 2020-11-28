package com.Trangsuc.vn.Service;

import java.util.List;

import com.Trangsuc.vn.Entity.Categorys;
import com.Trangsuc.vn.Entity.Menu;
import com.Trangsuc.vn.Entity.Slide;

import ProductDTO.ProductDTO;

public interface IhomeServiceI {
	public List<Categorys> getAllCategory();
	public List<Slide> getAllSlide();
	public List<Menu> getAllMenu();
	public List<ProductDTO> getAllProduct();
	
	
}
