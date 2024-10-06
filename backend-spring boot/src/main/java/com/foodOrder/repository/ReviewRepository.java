package com.foodOrder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodOrder.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
