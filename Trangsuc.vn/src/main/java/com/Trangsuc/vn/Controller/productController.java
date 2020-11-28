package com.Trangsuc.vn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Trangsuc.vn.Service.IProductService;

@Controller
public class productController extends baseController {

	@Autowired
	private IProductService productService;

	@RequestMapping(value = { "/tat-ca-san-pham" }, method = RequestMethod.GET)
	public ModelAndView all_Product() {
		_mv.addObject("all_product", this._homeServiceI.getAllProduct());
		_mv.setViewName("web/product/product");
		return _mv;
	}

	@RequestMapping(value = { "/details-product/{id}" }, method = RequestMethod.GET)
	public ModelAndView details_Product(@PathVariable("id") int id) {
		_mv.addObject("categorys", this._homeServiceI.getAllCategory());
		
		_mv.addObject("product", this.productService.getProductById(id));

	//	int idCate = this.productService.getProductById(id).getId_category();

		_mv.addObject("ProductByIdCategory", this._homeServiceI.getAllProduct());

		_mv.setViewName("web/product/product_details");
		return _mv;
	}
}
