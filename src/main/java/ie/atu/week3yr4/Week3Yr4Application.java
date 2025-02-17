package ie.atu.week3yr4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Week3Yr4Application {

    public static void main(String[] args) {
        SpringApplication.run(Week3Yr4Application.class, args);
    }

}
