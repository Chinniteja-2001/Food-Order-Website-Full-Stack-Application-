package com.foodOrder.service;

import java.util.List;

import com.foodOrder.model.Notification;
import com.foodOrder.model.Order;
import com.foodOrder.model.Restaurant;
import com.foodOrder.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
