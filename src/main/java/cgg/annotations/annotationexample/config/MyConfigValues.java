package cgg.annotations.annotationexample.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class MyConfigValues {
    
    @Value("${app.name}")
    private String appName;
    @Value("${app.port}")
    private String appPort;
    @Value("${app.database}")
    private String appDb;

}
