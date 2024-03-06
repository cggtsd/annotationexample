package cgg.annotations.annotationexample.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class PageController {
    
    @PostMapping("/page1")
 
    public List<String> home(){
        System.out.println("home page");
        return List.of("abc","xyz","uvw");
    }
}
