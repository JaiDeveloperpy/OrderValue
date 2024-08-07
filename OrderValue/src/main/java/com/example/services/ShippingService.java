package com.example.services;
import org.springframework.stereotype.Service;

import com.example.entities.Order;

@Service
public class ShippingService {
    public static double shipment(Order order){
        if (order.basic < 100){
            return 20.00;
        } else if (order.basic >= 100 & order.basic < 200) {
            return 12.00;
        }else {
            return 00.00;
        }
    }
}
