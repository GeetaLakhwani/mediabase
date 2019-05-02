package org.superbiz.moviefun.movies;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableAutoConfiguration
public class MovieMicroserviceApplication
{
    public static void main(String[] args) {
        SpringApplication.run(MovieMicroserviceApplication.class, args);
    }


}
