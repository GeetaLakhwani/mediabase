package org.superbiz.moviefun.podcast;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PodcastMicroserviceApplication {

    public static void main(String[] args) {

        SpringApplication.run(PodcastMicroserviceApplication.class, args);


    }
}
