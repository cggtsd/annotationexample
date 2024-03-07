package cgg.annotations.annotationexample.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@Getter
@Setter
@ConfigurationProperties("db")
public class DBSettings {
    
    private String connection;
    private String host;
    private int port;
}
