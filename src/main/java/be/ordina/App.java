package be.ordina;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.err.println("IS THIS WORKING????????????????????????????????????????????????");
        SpringApplication.run(App.class, args);
    }


}
