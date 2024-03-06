package cgg.annotations.annotationexample.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {
    
    @Value("${my.greeting}")
    private String greetMessage;

    @Value("some static message")
    private String staticMessage;

    @Value("${my.list.values}")
    private List<String> listValues;

    @Value("#{${my.dbvalues}}")
    private Map<String,String> dbValues;

    @GetMapping("/greet")
    public String greeting(){
        return greetMessage+staticMessage+listValues+dbValues;
    }
}
