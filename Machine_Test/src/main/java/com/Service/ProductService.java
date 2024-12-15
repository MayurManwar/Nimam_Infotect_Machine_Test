package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.ProductDao;
import com.entity.Category;
import com.entity.Product;

@Service
public class ProductService {
	@Autowired
	ProductDao sd;

	// Get All the Categories
	public List<Product> getAllProducttDetails() {
		return sd.getAllProducttDetails();
	}

	// create a new product
	public String insertIntoProduct(Product Details) {
		return sd.insertIntoProduct(Details);
	}

	// delete category by id
	public String deleteDetailsFromProduct(int id) {
		return sd.deleteDetailsFromProduct(id);
	}

	// update category by id
	public String updateDetailOfProduct(Product update) {
		return sd.updateDetailOfProduct(update);
	}
}
