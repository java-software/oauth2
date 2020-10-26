package com.software;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import javax.activation.MailcapCommandMap;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Demo_Null
 * @date 2020/10/26
 * @description
 */
@SpringBootApplication
@EnableResourceServer
public class NewResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewResourceApplication.class, args);
    }
}
