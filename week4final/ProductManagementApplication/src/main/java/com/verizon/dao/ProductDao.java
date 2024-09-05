package com.verizon.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.verizon.model.Product;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM Product p WHERE p.price BETWEEN :low AND :high")
    List<Product> findProductsBetweenPrice(@Param("low") Integer low, @Param("high") Integer high);
}