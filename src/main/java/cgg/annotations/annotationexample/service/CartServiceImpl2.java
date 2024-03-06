package cgg.annotations.annotationexample.service;

import org.springframework.stereotype.Component;

@Component("cart2")
public class CartServiceImpl2  implements CartService{

    @Override
    public void addToCart() {
        System.out.println("add to cart using cart service 2");
    }
    
}
