package multiLayerDemo.business.concretes;

import multiLayerDemo.business.abstracts.ProductService;
import multiLayerDemo.core.abstracts.LoggerService;
import multiLayerDemo.data.abstracts.ProductDao;
import multiLayerDemo.entity.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getProductName().length() <= 2) {
            System.out.println("Product name must be at least three characters.");
            return;
        } else
            this.productDao.add(product);
        loggerService.logToSystem("Product added. (" + product.getProductName() + ")");
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

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
