package com.github.rmnasri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

/**
 * Created by riadh on 07/05/15.
 */
@SpringBootApplication
public class GmfConfig extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GmfConfig.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GmfConfig.class, args);
    }

}