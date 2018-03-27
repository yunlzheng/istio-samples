package com.github.labs;


import com.github.labs.backend.BackendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableZuulProxy
@EnableFeignClients
@SpringBootApplication
public class Application {

    @Autowired
    private BackendService backendService;

    @RequestMapping("/")
    public ResponseEntity welcome() {
        return ResponseEntity.ok(backendService.welcome());
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
