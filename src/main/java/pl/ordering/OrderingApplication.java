package pl.ordering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pl.ordering")
public class OrderingApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderingApplication.class, args);
    }

}
