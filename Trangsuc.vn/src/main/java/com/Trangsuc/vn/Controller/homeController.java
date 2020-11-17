package com.Trangsuc.vn.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class homeController extends baseController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView homeView(Model model) {
		ModelAndView mv = new ModelAndView("user/index");
		mv.addObject("slides", this._homeServiceI.getAllSlide());
		mv.addObject("categorys", this._homeServiceI.getAllCategory());
		mv.addObject("menus", this._homeServiceI.getAllMenu());
		mv.addObject("products", this._homeServiceI.getAllProduct());
		mv.setViewName("user/index");
		return mv;
	}

	@RequestMapping(value = { "/product" })
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		mv.setViewName("user/product");
		return mv;
	}

}
