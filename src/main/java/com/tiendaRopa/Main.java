package com.tiendaRopa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@SpringBootApplication
@EntityScan("com.tiendaRopa")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
