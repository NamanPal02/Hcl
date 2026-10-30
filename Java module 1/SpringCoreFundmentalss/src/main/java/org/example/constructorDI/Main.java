package org.example.constructorDI;
// calling the objects and accessing the container
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class
Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp= ctx.getBean(Employee.class);
        emp.getAddress();
    }

}
