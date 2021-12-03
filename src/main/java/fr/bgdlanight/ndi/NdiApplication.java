package fr.bgdlanight.ndi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:context/*.xml"})
public class NdiApplication {
    public static void main(String[] args) {
        SpringApplication.run(NdiApplication.class, args);
    }
}
