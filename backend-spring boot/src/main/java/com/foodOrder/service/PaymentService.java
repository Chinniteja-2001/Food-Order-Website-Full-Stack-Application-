package com.foodOrder.service;

import com.foodOrder.model.Order;
import com.foodOrder.model.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
