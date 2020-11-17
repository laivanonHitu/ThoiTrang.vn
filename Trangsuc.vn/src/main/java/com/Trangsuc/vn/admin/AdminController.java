package com.Trangsuc.vn.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	@RequestMapping(value = { "/admin/" }, method = RequestMethod.GET)
	public ModelAndView adminView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/admin");
		return mv;
	}
}
