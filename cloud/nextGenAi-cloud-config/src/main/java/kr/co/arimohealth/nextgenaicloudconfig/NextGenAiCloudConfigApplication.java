package kr.co.arimohealth.nextgenaicloudconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class NextGenAiCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NextGenAiCloudConfigApplication.class, args);
    }

}
