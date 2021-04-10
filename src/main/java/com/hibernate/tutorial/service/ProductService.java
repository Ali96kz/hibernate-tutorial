package com.hibernate.tutorial.service;

import com.hibernate.tutorial.HibernateUtil;
import com.hibernate.tutorial.dao.ProductDao;
import com.hibernate.tutorial.model.Category;
import com.hibernate.tutorial.model.Client;
import com.hibernate.tutorial.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ProductService {

    private ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void save(Product product) {
        productDao.insertOrUpdate(product);
    }

    public void delete(Product product) {
        productDao.delete(product);
    }

    public Product get(int id) {
        return productDao.get(id);
    }

    public List<Product> getAll() {
        return productDao.getAll();
    }
}
