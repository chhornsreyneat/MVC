package co.istad;


import co.istad.cotroller.MenuController;
import co.istad.cotroller.ProductController;
import co.istad.util.Singleton;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApplication {
    private final Scanner scanner;
    private final MenuController menuController;
    private final  ProductController productController;
    public MainApplication(){
        scanner= Singleton.scanner();
        menuController = Singleton.menuController();
        productController= Singleton.controller();
    }
    private void run(){
        try{
            while(true){
                menuController.index();
                System.out.println("Enter Option: ");
                int option = Integer.parseInt(scanner.nextLine());
                switch (option){
                    case 1 -> productController.index();
                    case 2 -> productController.create();
                    case 3 -> productController.delete();
                    case 4 -> productController.update();
                    default -> throw  new IllegalStateException();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {

        new MainApplication().run();
    }
}
