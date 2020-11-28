package com.Trangsuc.vn.Service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trangsuc.vn.DAO.CartDAO;

import ProductDTO.CartDTO;
@Service
public class CartProductServiceImpl implements ICartProductService{
	@Autowired
	private CartDAO cartDAO =  new CartDAO();

	@Override
	public HashMap<Long, CartDTO> addCart(long id,  HashMap<Long, CartDTO> cart) {
		
		return this.cartDAO.addCart(id,  cart);
	}

	@Override
	public HashMap<Long, CartDTO> editCart(int id, int quantity, HashMap<Long, CartDTO> cart) {
		return this.cartDAO.editCart(id, quantity, cart);
	}

	@Override
	public HashMap<Long, CartDTO> deleteCart(long id, HashMap<Long, CartDTO> cart) {
		return this.cartDAO.deleteCart(id, cart);
	}

	@Override
	public int totalPrice(HashMap<Long, CartDTO> cart) {
		return this.cartDAO.totalPrice(cart);
	}

	@Override
	public int totalQuantity(HashMap<Long, CartDTO> cart) {
		return this.cartDAO.totalQuantity(cart);
	}

}
