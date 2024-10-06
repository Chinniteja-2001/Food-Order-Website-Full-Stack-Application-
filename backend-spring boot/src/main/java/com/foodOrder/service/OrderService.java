package com.foodOrder.service;

import java.util.List;

import com.foodOrder.Exception.CartException;
import com.foodOrder.Exception.OrderException;
import com.foodOrder.Exception.RestaurantException;
import com.foodOrder.Exception.UserException;
import com.foodOrder.model.Order;
import com.foodOrder.model.PaymentResponse;
import com.foodOrder.model.User;
import com.foodOrder.request.CreateOrderRequest;
import com.stripe.exception.StripeException;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
