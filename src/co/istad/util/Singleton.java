package co.istad.util;

import co.istad.cotroller.MenuController;
import co.istad.cotroller.ProductController;
import co.istad.dao.ProductDaoImpl;

import java.util.Scanner;

public class Singleton {
    //1 create state refer type
    private static  Scanner scanner;
    private static MenuController menuController;
    private static  ProductController controller;
    private static  ProductDaoImpl productDaoImpl;

    //2 create get instance
    public static Scanner scanner(){
        if (scanner==null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
    public static MenuController menuController(){
        if (menuController == null){
            menuController = new MenuController();
        }
        return menuController;
    }
    public static ProductController controller(){
        if (controller==null){
            controller = new ProductController();
        }
        return controller;
    }
    public static ProductDaoImpl productDaoImpl(){
        if (controller==null){
            productDaoImpl = new ProductDaoImpl();
        }
        return productDaoImpl;
    }

}
