package com.github.labs.remote;

import com.github.labs.model.Version;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "bar", url = "http://bar:8082")
public interface BarService {
    @RequestMapping("/")
    Version version();
}
