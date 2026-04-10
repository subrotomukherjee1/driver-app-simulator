package com.rideshare.analytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.rideshare.analytics")
public class App 
{
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }
}
