package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Service.ProductService;
import com.entity.Product;

@RestController
public class ProductController {
	@Autowired
	ProductService sc;

	@GetMapping("api/product")
	public List<Product> getAllProducttDetails() {
		return sc.getAllProducttDetails();
	}

	@PostMapping("api/product")
	public String insertIntoProduct(@RequestBody Product Details) {
		return sc.insertIntoProduct(Details);
	}

	@DeleteMapping("api/product/{id}")
	public String deleteDetailsFromProduct(@PathVariable int id) {
		return sc.deleteDetailsFromProduct(id);
	}

	@PutMapping("api/product/{id}")
	public String updateDetailOfProduct(@RequestBody Product update) {
		return sc.updateDetailOfProduct(update);
	}
}
