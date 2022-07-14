package org.example.products.dao;

import org.example.products.dto.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ProductDAOImplTest {

    @Test
    public void createShouldCreateAProduct()
    {
       ProductDAO dao = new ProductDAOImpl();
        Product product = new Product();
        product.setId(1);
        product.setName("IPhone");
        product.setDescription("Its Awesome");
        dao.create(product);
        Product result = dao.read(1);
        assertNotNull(result);
        assertEquals("IPhone",result.getName());

    }

    public void testCreate() {
    }

    public void testRead() {
    }

    public void testUpdate() {
    }

    public void testDelete() {
    }
}