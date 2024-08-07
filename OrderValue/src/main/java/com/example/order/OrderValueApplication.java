package com.example.order;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.entities.Order;
import com.example.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.example"})
public class OrderValueApplication implements CommandLineRunner {
	private OrderService orderService;
	
	public OrderValueApplication(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OrderValueApplication.class, args);
		


	}
	@Override
	public void run(String...args) throws Exception {
		Order order = new Order(1034, 150, 20.00);
		System.out.println(OrderService.total(order));
	}

}
