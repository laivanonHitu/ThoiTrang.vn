package com.Trangsuc.vn.Service;

import java.util.HashMap;

import ProductDTO.CartDTO;

public interface ICartProductService {
	public HashMap<Long, CartDTO> addCart(long id,  HashMap<Long, CartDTO> cart);
	public HashMap<Long, CartDTO> editCart(int id, int quantity, HashMap<Long, CartDTO> cart);
	public HashMap<Long, CartDTO> deleteCart(long id, HashMap<Long, CartDTO> cart);
	public int totalPrice(HashMap<Long, CartDTO> cart);
	public int totalQuantity(HashMap<Long, CartDTO> cart);
}
