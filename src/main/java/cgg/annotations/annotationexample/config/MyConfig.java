package cgg.annotations.annotationexample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import cgg.annotations.annotationexample.service.ProductService;

@Configuration
@PropertySource("classpath:myconfig.properties")
public class MyConfig {
    
    @Bean
    ProductService productService(){
        return new ProductService();
    }
}
