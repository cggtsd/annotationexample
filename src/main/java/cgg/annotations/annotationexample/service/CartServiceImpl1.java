package cgg.annotations.annotationexample.service;

import org.springframework.stereotype.Component;

@Component("cart1")
public class CartServiceImpl1 implements CartService{

    @Override
    public void addToCart() {
        System.out.println("add to cart using cart service 1");
    }
    
}
