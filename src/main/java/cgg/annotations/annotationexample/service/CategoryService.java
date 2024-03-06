package cgg.annotations.annotationexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class CategoryService {
    
    @Autowired
    private ProductService productService;
   @Autowired
   @Qualifier("cart2")
    private CartService cartService;

}
