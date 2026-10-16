package org.example;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;



@Configuration
public class AppConfig {
// been-talking about object part
    @Bean
    public Employee employee(){
        return new Employee();
    }
}
