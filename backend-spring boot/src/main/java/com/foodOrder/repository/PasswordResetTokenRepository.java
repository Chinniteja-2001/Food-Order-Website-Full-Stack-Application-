package com.foodOrder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodOrder.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
