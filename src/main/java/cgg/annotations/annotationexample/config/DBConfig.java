package cgg.annotations.annotationexample.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name="database.active",havingValue = "true")
public class DBConfig {
    
    @Bean
    DBDataSource dbDataSource(){
          return new DBDataSource();
    }
}
