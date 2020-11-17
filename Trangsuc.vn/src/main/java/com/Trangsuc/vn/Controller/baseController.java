package com.Trangsuc.vn.Controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import com.Trangsuc.vn.Service.HomeServiceI;

@Controller
public class baseController {
	@Autowired
	public HomeServiceI _homeServiceI;
	public ModelAndView _mv = new ModelAndView();

	@PostConstruct
	public ModelAndView init() {
		_mv.addObject("listSlide", this._homeServiceI.getAllSlide());
		_mv.addObject("category", this._homeServiceI.getAllCategory());
		_mv.addObject("menus", this._homeServiceI.getAllMenu());
		_mv.addObject("products", this._homeServiceI.getAllProduct());
		_mv.addObject("products", this._homeServiceI.getAllProduct());
		return _mv;
	}
}
