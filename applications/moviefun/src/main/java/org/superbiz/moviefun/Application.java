package org.superbiz.moviefun;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.superbiz.moviefun.moviesui.ActionServlet;
import org.superbiz.moviefun.moviesui.MovieClient;
import org.superbiz.moviefun.podcastsui.PodcastClient;



@SpringBootApplication
public class Application {

    /*@Value("${movies.ms.url")
    private String moviesURL;

    @Value("${podcast.ms.url")
    private String podcastsURL;*/

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ServletRegistrationBean registerActionServlet(ActionServlet actionServlet) {
        return new ServletRegistrationBean(actionServlet, "/moviefun/*");
    }

    @Bean
    public RestOperations restOperations() {
        return new RestTemplate();
    }

    @LoadBalanced
    @Bean
    public MovieClient movieClient(RestOperations restOperations) {

        return new MovieClient("//movies-ms/movies", restOperations);
    }

    @LoadBalanced
    @Bean
    public PodcastClient podcastClient(RestOperations restOperations) {
        return new PodcastClient("//podcasts-ms/podcasts", restOperations);
    }

}