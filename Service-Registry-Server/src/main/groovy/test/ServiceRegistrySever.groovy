package test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ServiceRegistrySever {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "service-registry");
        SpringApplication.run(ServiceRegistrySever.class, args);
    }
}
