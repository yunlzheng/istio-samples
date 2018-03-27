package com.github.labs;

import com.github.labs.model.Version;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class Application {

    @Value("${spring.application.version}")
    private String version;

    @RequestMapping("/")
    public ResponseEntity version() {
        return ResponseEntity.ok(new Version(version));
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
