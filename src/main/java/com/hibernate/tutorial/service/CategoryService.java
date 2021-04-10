package com.hibernate.tutorial.service;

import com.hibernate.tutorial.HibernateUtil;
import com.hibernate.tutorial.dao.CategoryDao;
import com.hibernate.tutorial.model.Category;
import com.hibernate.tutorial.model.Client;
import com.hibernate.tutorial.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CategoryService {

    private CategoryDao categoryDao;

    public CategoryService(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public void save(Category category) {
        categoryDao.insertOrUpdate(category);
    }

    public void delete(Category category) {
        categoryDao.delete(category);
    }

    public Category get(int id) {
        return categoryDao.get(id);
    }

    public List<Category> getAll() {
        return categoryDao.getAll();
    }
}
