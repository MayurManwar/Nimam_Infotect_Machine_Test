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

import com.Service.CategoryService;
import com.entity.Category;

@RestController
public class CategoryController {
	@Autowired
	CategoryService sc;

	@GetMapping("api/Category")
	public List<Category> getAllCategoryDetails() {
		return sc.getAllCategoryDetails();
	}

	@PostMapping("api/Categorirs")
	public String insertIntoCategory(@RequestBody Category Details) {
		return sc.insertIntoCategory(Details);
	}

	@DeleteMapping("api/Categorirs/{id}")
	public String deleteDetailsFromCategory(@PathVariable int id) {
		return sc.deleteDetailsFromCategory(id);
	}

	@PutMapping("api/Categorirs/{id}")
	public String updateDetailOfCategory(@RequestBody Category update) {
		return sc.updateDetailOfCategory(update);
	}

}
