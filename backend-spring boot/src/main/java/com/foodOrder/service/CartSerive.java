package com.foodOrder.service;

import com.foodOrder.Exception.CartException;
import com.foodOrder.Exception.CartItemException;
import com.foodOrder.Exception.FoodException;
import com.foodOrder.Exception.UserException;
import com.foodOrder.model.Cart;
import com.foodOrder.model.CartItem;
import com.foodOrder.model.Food;
import com.foodOrder.model.User;
import com.foodOrder.request.AddCartItemRequest;
import com.foodOrder.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
