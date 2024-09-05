package com.verizon.service;

import com.verizon.dao.ProductDao;
import com.verizon.exception.CustomException;
import com.verizon.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public String addProduct(Product product) {
        productDao.save(product);
        return "Updated Product";
    }

    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    public Product getProductById(Integer id) throws CustomException {
        return productDao.findById(id).orElseThrow(() -> new CustomException("Product not found with id: " + id));
    }

    public List<Product> getAllProductsBetweenPrice(Integer low, Integer high) {
        return productDao.findProductsBetweenPrice(low, high);
    }

    public Product updateProduct(Integer id, Product product) throws CustomException {
        if (!productDao.existsById(id)) {
            throw new CustomException("Product not found with id: " + id);
        }
        product.setPid(id);
        return productDao.save(product);
    }

    public String deleteProduct(Integer id) throws CustomException {
        if (!productDao.existsById(id)) {
            throw new CustomException("Product not found with id: " + id);
        }
        productDao.deleteById(id);
        return "deleted";
    }
}