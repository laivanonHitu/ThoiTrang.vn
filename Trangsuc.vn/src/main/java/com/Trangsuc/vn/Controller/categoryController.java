package com.Trangsuc.vn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Trangsuc.vn.Service.IPaginationService;
import com.Trangsuc.vn.Service.IcategoryService;

import ProductDTO.PaginatesDto;

@org.springframework.stereotype.Controller
public class categoryController extends baseController {
	@Autowired
	private IcategoryService categoryService;

	@Autowired
	private IPaginationService PaginationService;
	private int totalProductPage = 9;
	@RequestMapping(value = { "/san-pham/{id}" }, method = RequestMethod.GET)
	public ModelAndView homeView(@PathVariable("id") int id) {
		int totalProductPage = 9;
		int currentPage = 1;
		
		int totalData = categoryService.getDataProductsById(id).size();
		
		
		PaginatesDto PaginatesInfo = PaginationService.GetInfoPaginates(totalData, totalProductPage, currentPage);
		
		_mv.addObject("product", this._homeServiceI.getAllProduct());
		
		_mv.addObject("PaginatesInfo", PaginatesInfo);
		
		System.out.println(PaginatesInfo);
		System.out.println(totalData);
		
		_mv.addObject("productPaginateById", this.categoryService.getDataProductsById(id));
		_mv.addObject("id", id);
		_mv.addObject("productPaginate",categoryService.getDataProductsPaginate(PaginatesInfo.getStart(), PaginatesInfo.getEnd()));
		
		_mv.setViewName("web/product/productByCategory");
		
		return _mv;
	}
	
	
	@RequestMapping(value = { "/san-pham/{id}/{currentPage}" }, method = RequestMethod.GET)
	public ModelAndView currentPageView(@PathVariable("id") int id, @PathVariable("currentPage") int currentPage) {
		
		int totalData = categoryService.getDataProductsById(id).size();
		
		PaginatesDto PaginatesInfoCurrentPage = PaginationService.GetInfoPaginates(totalData, totalProductPage, currentPage);
		
		_mv.addObject("product", this._homeServiceI.getAllProduct());
		
		_mv.addObject("PaginatesInfoCurrentPage", PaginatesInfoCurrentPage);
		
		_mv.addObject("productPaginateById", this.categoryService.getDataProductsById(id));
		
		_mv.addObject("id", id);
		
		_mv.addObject("productPaginate",categoryService.getDataProductsPaginate(PaginatesInfoCurrentPage.getStart(), PaginatesInfoCurrentPage.getEnd()));
		
		_mv.setViewName("web/product/productByCategory");
		
		return _mv;
	}
}
