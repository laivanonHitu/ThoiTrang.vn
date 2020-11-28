package com.Trangsuc.vn.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class homeController extends baseController {
	
	

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public ModelAndView homeView(Model model) {
		_mv.addObject("slides", this._homeServiceI.getAllSlide());
		_mv.addObject("categorys", this._homeServiceI.getAllCategory());
		_mv.addObject("menus", this._homeServiceI.getAllMenu());
		_mv.addObject("products", this._homeServiceI.getAllProduct());
		_mv.addObject("Banner", this._IProductService.getProductBanner());
		
		_mv.setViewName("web/web");
		return _mv;
	}
}
