package co.istad.database;

import co.istad.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDataBase {
    private List<Product> products ;
    public ProductDataBase(){
        products=new ArrayList<>();
        products.add(new Product(3L,"Coca",100,2500.00, LocalDate.now()));
        products.add(new Product(2L,"Pepsi",100,2500.00, LocalDate.now()));
        products.add(new Product(1L,"Milk",100,1500.00, LocalDate.now()));
    }
    public List<Product> getProducts(){
        return products;
    }
}
