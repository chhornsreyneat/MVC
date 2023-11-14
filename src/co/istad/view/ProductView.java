package co.istad.view;

import co.istad.model.Product;

import java.util.List;

import static java.lang.System.*;

public class ProductView {
    public static void printList(List<Product> products){
        out.print("Product List");
        products.forEach(product ->{
            out.println("ID : "+product.getId());
            out.println("NAME : "+product.getName());
            out.println("QTY : "+product.getQty());
            out.println("PRICE : "+product.getPrice());
            out.println("IMPORT DATE : "+product.getImportedDate());
            System.out.println("-".repeat(40));
        });
    }
}
