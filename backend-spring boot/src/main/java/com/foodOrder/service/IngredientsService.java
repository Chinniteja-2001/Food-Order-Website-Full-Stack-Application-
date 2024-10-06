package com.foodOrder.service;

import java.util.List;

import com.foodOrder.Exception.FoodException;
import com.foodOrder.Exception.RestaurantException;
import com.foodOrder.model.Food;
import com.foodOrder.model.IngredientCategory;
import com.foodOrder.model.IngredientsItem;
import com.foodOrder.repository.IngredientsCategoryRepository;

public interface IngredientsService {
	
	public IngredientCategory createIngredientsCategory(
			String name,Long restaurantId) throws RestaurantException;

	public IngredientCategory findIngredientsCategoryById(Long id) throws Exception;

	public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception;
	
	public List<IngredientsItem> findRestaurantsIngredients(
			Long restaurantId);

	
	public IngredientsItem createIngredientsItem(Long restaurantId, 
			String ingredientName,Long ingredientCategoryId) throws Exception;

	public IngredientsItem updateStoke(Long id) throws Exception;
	
}
