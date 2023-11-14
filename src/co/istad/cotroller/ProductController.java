package co.istad.cotroller;

import co.istad.model.Product;
import co.istad.service.ProductService;
import co.istad.service.ProductServiceViewImpl;
import co.istad.util.Singleton;
import co.istad.view.ProductView;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class ProductController {
    private final  Scanner scanner;
    private ProductService productService;
    public ProductController(){
        productService=new ProductServiceViewImpl();

        scanner = Singleton.scanner();
    }
    public void index(){
        List<Product>products =productService.select();
        ProductView.printList(products);
    }
    public void delete() {
        System.out.print("Enter id you want to delete : ");
        long proID = Long.parseLong(scanner.nextLine());
        Product product = productService.deleteById(proID);
    }
    public void create() {
        System.out.print("Enter product id : ");
        long proID = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product name : ");
        String proName = scanner.nextLine();
        System.out.print("Enter product qty : ");
        int proQty = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product price : ");
        double proPrice = Double.parseDouble(scanner.nextLine());
        Product addProduct = new Product(proID, proName, proQty, proPrice, LocalDate.now());
        Product product = productService.insert(addProduct);
    }
    public void update() {

    }
}
