package com.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Category;
import com.entity.Product;

@Repository
public class ProductDao {

	@Autowired
	SessionFactory sf;

// Get All the Product
	public List<Product> getAllProducttDetails() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Product.class);
		List<Product> mm = criteria.list();
		return mm;
	}

	// create a new product
	public String insertIntoProduct(Product Details) {
			Session session= sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(Details);
			transaction.commit();
			return " Isert details into Product";
	/		
		}

	// delete category by id
	public String deleteDetailsFromProduct(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Product st = session.get(Product.class, id);
		session.delete(st);
		tr.commit();
		return "Delele Details from Product";
	}

	// update category by id
	public String updateDetailOfProduct(Product update) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.update(update);
		tr.commit();
		return " update details of Category";
	}

}
