package com.Trangsuc.vn.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Trangsuc.vn.Controller.baseController;
import com.Trangsuc.vn.Service.IProductService;

@Controller
public class AdminController extends baseController {
	@Autowired
	private IProductService productService;

	@RequestMapping(value = { "/admin/" }, method = RequestMethod.GET)
	public ModelAndView adminView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/admin");
		return mv;
	}

	@RequestMapping(value = { "/admin/category" }, method = RequestMethod.GET)
	public ModelAndView allCategoryView() {
		_mv.addObject("product", this._homeServiceI.getAllProduct());
		_mv.setViewName("admin/category");
		return _mv;
	}

	@RequestMapping(value = { "/admin/product" }, method = RequestMethod.GET)
	public ModelAndView allProductView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/allProduct");
		return mv;
	}

	@RequestMapping(value = { "/admin/oder" }, method = RequestMethod.GET)
	public ModelAndView allCartView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/oder");
		return mv;
	}

	@RequestMapping(value = { "/admin/coupon" }, method = RequestMethod.GET)
	public ModelAndView allCoponView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/copon");
		return mv;
	}

	@RequestMapping(value = { "/admin/CKeditor" }, method = RequestMethod.GET)
	public ModelAndView CKeditorView() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("admin/CKeditor");
		return mv;
	}
	
	@RequestMapping(value = { "/admin/delete/{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteProduct(@PathVariable("id") int id) {
		_mv.addObject("delete", this.productService.delete(id));
		_mv = new ModelAndView("redirect:/admin/category");
		return _mv;
	}
}
