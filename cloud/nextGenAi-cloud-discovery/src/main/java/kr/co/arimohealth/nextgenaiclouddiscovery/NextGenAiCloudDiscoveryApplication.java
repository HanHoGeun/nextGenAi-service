package kr.co.arimohealth.nextgenaiclouddiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class NextGenAiCloudDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(NextGenAiCloudDiscoveryApplication.class, args);
    }

}
