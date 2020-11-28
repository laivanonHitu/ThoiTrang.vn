package com.Trangsuc.vn.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Trangsuc.vn.Service.InsertProducts;

import ProductDTO.ProductDTO;

@Controller
public class addProductController {
	@Autowired
	private InsertProducts insertP;
	
	@RequestMapping(value = {"/admin/add-product" }, method = RequestMethod.GET)
	public ModelAndView adminView(@ModelAttribute("dto") ProductDTO dto, ModelMap model){
		ProductDTO productDTO = new ProductDTO();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/add-product");
		return mv;
	}
}
