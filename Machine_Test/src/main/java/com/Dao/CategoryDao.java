package com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SelfStudy.CollegeManagementSystem.entity.Student;
import com.entity.Category;
import com.entity.Product;

@Repository
public class CategoryDao {
	@Autowired
	SessionFactory sf;

	// Get All the Categories
	public List<Category> getAllCategoryDetails() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Category.class);
		List<Category> mm = criteria.list();
		return mm;
	}

	// create a new category
	public String insertIntoCategory(Category Details) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(Details);
		transaction.commit();
		return " Isert details into Category";

	}

	// Delete category by id
	public String deleteDetailsFromCategory(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Category st = session.get(Category.class, id);
		session.delete(st);
		tr.commit();
		return "Delele Details from Category";
	}

	// update category by id
	public String updateDetailOfCategory(Category update) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(update);
		tr.commit();
		return " update details of Category";
	}
}
