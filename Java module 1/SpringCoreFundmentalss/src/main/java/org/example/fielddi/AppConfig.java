package org.example.fielddi;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.fielddi") // scans all the components in the package
public class AppConfig {
}
