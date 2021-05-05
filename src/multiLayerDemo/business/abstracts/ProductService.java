package multiLayerDemo.business.abstracts;

import multiLayerDemo.entity.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    void update(Product product);
    void delete(Product product);
    Product get(int id);
    List<Product> getAll();

}
