package be.ordina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@SpringBootApplication
@PropertySource("classpath:application.properties")
public class App {
    public static void main(String[] args) {
        System.err.println("IS THIS WORKING????????????????????????????????????????????????");
        SpringApplication.run(App.class, args);
    }
}
