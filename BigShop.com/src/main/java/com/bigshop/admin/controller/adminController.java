package com.bigshop.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bigshop.service.ProductService;
import com.bigshop.web.controller.baseController;

@Controller
public class adminController extends baseController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = { "/admin" }, method = RequestMethod.GET)
	public ModelAndView adminView() {
		_mv = new ModelAndView("admin/home");
		_mv.addObject("product", this.productService.getAllProduct());
		return _mv;
	}
}
