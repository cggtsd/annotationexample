package cgg.annotations.annotationexample.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cgg.annotations.annotationexample.config.DBSettings;

@RestController
public class GreetingsController {
    
    @Value("${my.greeting:default value}")
    private String greetMessage;

    @Value("some static message")
    private String staticMessage;

    @Value("${my.list.values}")
    private List<String> listValues;

    @Value("#{${my.dbvalues}}")
    private Map<String,String> dbValues;

    @Autowired
    private DBSettings dbSettings;

    @GetMapping("/greet")
    public String greeting(){
        // return greetMessage+staticMessage+listValues+dbValues;
        return dbSettings.getConnection()+dbSettings.getHost()+dbSettings.getPort();
    }
}
