package com.logging.aop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
	@GetMapping("/getProductList")
	public List getProducts() {
		List productList=new ArrayList();
		productList.add("Computer");
		productList.add("Mobile");
		productList.add("Laptop");
		productList.add("Tab");
		
		return productList;
	}
}
