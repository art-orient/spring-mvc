package itvdn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "itvdn")
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class);
    }
}
