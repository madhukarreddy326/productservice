package org.example.products.dao;

import org.example.products.dto.Product;

public interface ProductDAO {
    void create(Product product);
    Product read(int id);
    void update(Product product);
    void delete(int id);
}
