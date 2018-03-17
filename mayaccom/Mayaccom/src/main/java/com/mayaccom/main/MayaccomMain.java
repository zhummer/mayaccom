package com.mayaccom.main;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
 
@SpringBootApplication
public class MayaccomMain extends SpringBootServletInitializer {
 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MayaccomMain.class);
    }
 
    public static void main(String[] args) {
        SpringApplication.run(MayaccomMain.class, args);
    }
}
