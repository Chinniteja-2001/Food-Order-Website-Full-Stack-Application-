package com.foodOrder.service;

import java.util.List;

import com.foodOrder.Exception.FoodException;
import com.foodOrder.Exception.RestaurantException;
import com.foodOrder.model.Category;
import com.foodOrder.model.Food;
import com.foodOrder.model.Restaurant;
import com.foodOrder.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
