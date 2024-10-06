package com.foodOrder.request;

import java.util.List;

import com.foodOrder.model.Food;

import lombok.Data;

@Data
public class AddCartItemRequest {
	
	private Long menuItemId;
	private int quantity;
	private List<String> ingredients;

}
