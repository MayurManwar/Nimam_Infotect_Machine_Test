package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	private int categoryId;
	private String categoryName;
	private String description;
	private boolean isActive;

	@Id

	// Getter and Setter for categoryId
	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	// Getter and Setter for categoryName
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	// Getter and Setter for description
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Getter and Setter for isActive
	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", description=" + description
				+ ", isActive=" + isActive + "]";
	}

}
