package com.example.services;

import org.springframework.stereotype.Service;

import com.example.entities.Order;

@Service
public class OrderService {

	
	public static double total(Order order){
        return  (order.basic - (order.discount * order.basic / 100)) + ShippingService.shipment(order);
        
    }
}
