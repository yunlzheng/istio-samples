package com.github.labs.remote;

import com.github.labs.model.Version;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "foo", url = "http://foo:8081")
public interface FooService {
    @RequestMapping("/")
    Version version();
}
