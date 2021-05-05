package multiLayerDemo.data.concretes;

import multiLayerDemo.data.abstracts.ProductDao;
import multiLayerDemo.entity.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {
    @Override
    public void add(Product product) {
        System.out.println(product.getProductName()+" added.");
    }

    @Override
    public void update(Product product) {
        System.out.println(product.getProductName()+" updated.");
    }

    @Override
    public void delete(Product product) {
        System.out.println(product.getProductName()+" deleted.");
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
