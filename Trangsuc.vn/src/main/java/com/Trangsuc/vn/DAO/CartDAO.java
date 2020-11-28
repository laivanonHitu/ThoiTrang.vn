package com.Trangsuc.vn.DAO;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ProductDTO.CartDTO;
import ProductDTO.ProductDTO;

@Repository
public class CartDAO extends baseDAO {

	@Autowired
	ProductDTO_DAO productDTO_DAO = new ProductDTO_DAO();

	public HashMap<Long, CartDTO> addCart(long id, HashMap<Long, CartDTO> cart) {
		ProductDTO productDTO = productDTO_DAO.FindProductCart(id);
		CartDTO itemsCart = new CartDTO();
		if (productDTO != null && cart.containsKey(id)) {
			itemsCart = cart.get(id);

			itemsCart.setQuantity(itemsCart.getQuantity() + 1);
			itemsCart.setTotalPrice(itemsCart.getQuantity() * itemsCart.getProductDTO().getPrice());
		} else {
			itemsCart.setProductDTO(productDTO);
			itemsCart.setQuantity(1);
			itemsCart.setTotalPrice(productDTO.getPrice());
		}
		cart.put((long) id, itemsCart);
		return cart;
	}

	@SuppressWarnings("unlikely-arg-type")
	public HashMap<Long, CartDTO> editCart(int id, int quantity, HashMap<Long, CartDTO> cart) {
		CartDTO itemsCart = new CartDTO();
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			itemsCart = cart.get(id);
			itemsCart.setQuantity(quantity);
			double totalPrice = quantity * (itemsCart.getProductDTO().getPrice());
			itemsCart.setTotalPrice(totalPrice);
		}

		cart.put((long) id, itemsCart);
		return cart;
	}

	public HashMap<Long, CartDTO> deleteCart(long id, HashMap<Long, CartDTO> cart) {
		if (cart == null) {
			return cart;
		}
		if (cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}

	public int totalQuantity(HashMap<Long, CartDTO> cart) {
		int totalQuantity = 0;
		for (Map.Entry<Long, CartDTO> itemsCart : cart.entrySet()) {
			totalQuantity += itemsCart.getValue().getQuantity();
		}
		return totalQuantity;
	}

	public int totalPrice(HashMap<Long, CartDTO> cart) {
		int totalPrice = 0;
		for (Map.Entry<Long, CartDTO> itemsCart : cart.entrySet()) {
			totalPrice += itemsCart.getValue().getTotalPrice();
		}
		return totalPrice;
	}
}
