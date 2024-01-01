package com.javatechie.aws.cicd.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@SpringBootApplication
public class SpringbootOrderServiceAwspipelineApplication {

	@Autowired
	OrderDAO orderDAO;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootOrderServiceAwspipelineApplication.class, args);
	}
	
	@GetMapping
	public List<Order> fetchOrders(){
		return orderDAO.getOrders().stream()
				.sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
	}
}
