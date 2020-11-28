package com.Trangsuc.vn.Controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Trangsuc.vn.Service.CartProductServiceImpl;
import com.Trangsuc.vn.Service.ICartProductService;

import ProductDTO.CartDTO;

@Controller
public class CartController extends baseController {
	@Autowired
	private CartProductServiceImpl CartProductServiceImpl = new CartProductServiceImpl();

	@RequestMapping(value = "gio-hang")
	public ModelAndView CartView() {
		_mv.addObject("slides", this._homeServiceI.getAllSlide());
		_mv.addObject("categorys", this._homeServiceI.getAllCategory());
		_mv.addObject("menus", this._homeServiceI.getAllMenu());
		_mv.addObject("products", this._homeServiceI.getAllProduct());
		_mv.addObject("Banner", this._IProductService.getProductBanner());
		_mv =  new ModelAndView("web/cart/cart_products");
		return _mv;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "AddCart/{id}")
	public String addCart(HttpServletRequest request, HttpSession httpSession, @PathVariable long id) {
		HashMap<Long, CartDTO> cart = (HashMap<Long, CartDTO>) httpSession.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Long, CartDTO>();
		}

		cart = CartProductServiceImpl.addCart(id, cart);
		httpSession.setAttribute("Cart", cart);
		httpSession.setAttribute("TotalCart", CartProductServiceImpl.totalQuantity(cart));
		httpSession.setAttribute("TotalPrice", CartProductServiceImpl.totalPrice(cart));
		return "redirect:" + request.getHeader("Referer");
	}
	
	@RequestMapping(value = "delete/{id}")
	public String removeCart(HttpServletRequest request, HttpSession httpSession, @PathVariable long id) {
		@SuppressWarnings("unchecked")
		HashMap<Long, CartDTO> cart = (HashMap<Long, CartDTO>) httpSession.getAttribute("Cart");
		if (cart == null) {
			cart = new HashMap<Long, CartDTO>();
		}

		cart = CartProductServiceImpl.deleteCart( id, cart);
		httpSession.setAttribute("Cart", cart);
		return "redirect:" + request.getHeader("Referer");
	}

}
