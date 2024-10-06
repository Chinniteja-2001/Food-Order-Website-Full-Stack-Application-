package com.foodOrder.service;

import java.util.List;

import com.foodOrder.Exception.ReviewException;
import com.foodOrder.model.Review;
import com.foodOrder.model.User;
import com.foodOrder.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
