package com.Trangsuc.vn.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Trangsuc.vn.Controller.baseController;
import com.Trangsuc.vn.Entity.Product;
import com.Trangsuc.vn.Service.IProductService;

@Controller
public class editProductController extends baseController {
	@Autowired
	private IProductService iProduct;

	@RequestMapping(value = "/admin/edit-product/{id}")
	public ModelAndView editView(@PathVariable("id") int id, @ModelAttribute Product product) {
		_mv.addObject("product", this.iProduct.getProductById(id));
		_mv.addObject("update", this.iProduct.sqlUpdateProduct(product));
		_mv.addObject("products", product);
		_mv.setViewName("admin/edit_Product");
		return _mv;
	}
}
