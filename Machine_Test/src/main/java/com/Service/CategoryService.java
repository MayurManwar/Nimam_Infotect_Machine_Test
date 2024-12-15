package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.CategoryDao;
import com.entity.Category;

@Service
public class CategoryService {
	@Autowired
	CategoryDao sd;

	// Get All the Categories
	public List<Category> getAllCategoryDetails() {
		return sd.getAllCategoryDetails();
	}

	// create a new category
	public String insertIntoCategory(Category Details) {
		return sd.insertIntoCategory(Details);
	}

	// Delete category by id
	public String deleteDetailsFromCategory(int id) {
		return sd.deleteDetailsFromCategory(id);
	}

	// update category by id
	public String updateDetailOfCategory(Category update) {
		return sd.updateDetailOfCategory(update);
	}
}
