package com.javatechie.aws.cicd.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO {

	public List<Order> getOrders(){
		
		return Stream.of(
				new Order(101,"Mobile",1,15000),
				new Order(102,"Laptop",1,60000),
				new Order(103,"Books",5,2000),
				new Order(104,"Headset",2,1000)
				).collect(Collectors.toList());
	}
}
