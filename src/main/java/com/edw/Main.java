package com.edw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * <pre>
 *  com.edw.Main
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 22 Feb 2025 16:12
 */
@SpringBootApplication
@EnableCaching
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
