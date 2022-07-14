package org.example.products.bo;

import org.example.products.dto.Product;

public interface ProductBO {
    void create(Product product);
    Product findProduct(int id);
}
