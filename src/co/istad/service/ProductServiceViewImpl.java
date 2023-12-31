package co.istad.service;

import co.istad.dao.ProductDao;
import co.istad.dao.ProductDaoImpl;
import co.istad.exception.ProductNotFoundException;
import co.istad.model.Product;

import java.util.List;

public class ProductServiceViewImpl implements ProductService {

    private final ProductDao productDao;
    public ProductServiceViewImpl(){
        productDao= new ProductDaoImpl();
    }
    @Override
    public Product insert(Product product) {
        return productDao.insert(product);
    }

    @Override
    public List<Product> select() {
        return productDao.select();
    }

    @Override
    public Product selectById(Long id) {
        return productDao.selectById(id).orElseThrow(()->new ProductNotFoundException(String.format(
                "Product ID %s does not exist in DB",id)));

    }

    @Override
    public Product updateById(Product product) {
        return null;
    }

    @Override
    public Product deleteById(Long id) {
        return null;
    }
    @Override
    public List<Product> selectByName(String name) {
        return productDao.selectByName(name);
    }
}
