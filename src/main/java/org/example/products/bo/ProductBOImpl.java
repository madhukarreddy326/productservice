package org.example.products.bo;

import org.example.products.dao.ProductDAO;
import org.example.products.dao.ProductDAOImpl;
import org.example.products.dto.Product;

public class ProductBOImpl implements ProductBO {
    private ProductDAO dao = new ProductDAOImpl();
    @Override
    public void create(Product product) {
        dao.create(product);
    }

    @Override
    public Product findProduct(int id) {
        return dao.read(id);

    }
}
