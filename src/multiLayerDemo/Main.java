package multiLayerDemo;

import multiLayerDemo.business.abstracts.ProductService;
import multiLayerDemo.business.concretes.ProductManager;
import multiLayerDemo.core.abstracts.LoggerService;
import multiLayerDemo.core.concretes.JLoggerManagerAdapter;
import multiLayerDemo.data.concretes.HibernateProductDao;
import multiLayerDemo.entity.concretes.Product;

public class Main {
    public static void main(String[] args) {

        ProductService pS = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());

        Product product = new Product(1, 1, "Apple", 12, 100);
        pS.add(product);
    }
}
