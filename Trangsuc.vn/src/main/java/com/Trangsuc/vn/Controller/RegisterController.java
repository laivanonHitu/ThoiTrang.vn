package com.Trangsuc.vn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Trangsuc.vn.Entity.User;
import com.Trangsuc.vn.Service.AccountServiceImpl;

@Controller
public class RegisterController extends baseController {
	@Autowired
	private AccountServiceImpl account;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView registerView() {
		_mv.addObject("categorys", this._homeServiceI.getAllCategory());
		_mv.setViewName("web/account/register");
		_mv.addObject("user", new User());
		return _mv;
	}

	@RequestMapping(value = "/dang-ky",method = RequestMethod.POST)
	public ModelAndView registerAcction(@ModelAttribute("user") User user) {
		_mv.addObject("categorys", this._homeServiceI.getAllCategory());
		_mv.setViewName("web/account/register");
		_mv.addObject("User", new User());
		int count = account.addAccount(user);
		if (count > 0) {
			_mv.addObject("status", "Đăng ký thành công");
		} else {
			_mv.addObject("status", "Tài khoản hoặc mật khẩu tồn tại");
		}

		return _mv;
	}

//	@RequestMapping(value = "/dang-nhap",method = RequestMethod.POST)
//	public ModelAndView loginAcction(@ModelAttribute("user") User user) {
//		_mv.addObject("categorys", this._homeServiceI.getAllCategory());
//		_mv.setViewName("web/account/register");
//		_mv.addObject("User", new User());
//		boolean check = account.loginAccount(user);
//		if (check) {
//			_mv.addObject("statusLogin", "Đăng nhập thành công");
//		} else {
//			_mv.addObject("statusLogin", "Sai thông tin đăng nhập");
//		}
//
//		return _mv;
//	}
}
