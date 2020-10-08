package com.richa;

import com.richa.model.Product;
import com.richa.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Application {

    public static void main(String[] args)
    {
        ProductService productService= new ProductService();
        List<Product> products = new ArrayList<>();
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total number of order");
        int n = in.nextInt();
        for (int i = 0; i < n; i++)
        {
            Product p = new Product();
            String type= in.next();
            p.setId(type);
            productService.getPriceByType(p);
            products.add(p);
        }

        int totalPrice = productService.getTotalPrice(products);
        System.out.println("Total Price: "+totalPrice);

    }
}
