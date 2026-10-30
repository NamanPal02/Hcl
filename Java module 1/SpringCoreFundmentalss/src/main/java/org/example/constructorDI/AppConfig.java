package org.example.constructorDI;
// creation of object and integrating
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
// Dependency Ingestion
@Configuration
public class AppConfig {
    @Bean
    public Address address(){
        return new Address();
    }
    @Bean
    public Employee employee(Address address){
        return new Employee(address);
    }
}
