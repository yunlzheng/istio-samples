package com.github.labs.backend;

import com.github.labs.model.Welcome;
import com.github.labs.remote.BarService;
import com.github.labs.remote.FooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackendService {

    private BarService barService;
    private FooService fooService;

    @Autowired
    public BackendService(BarService barService, FooService fooService) {
        this.barService = barService;
        this.fooService = fooService;
    }

    public Welcome welcome() {
        Welcome welcome = new Welcome();
        welcome.setMessage("This is message fro frontendt");

        try {
            welcome.setBarVersion(barService.version().getVersion());
        }catch (Exception e){
            welcome.setBarVersion("Unknown");
        }

        try {
            welcome.setFooVersion(fooService.version().getVersion());
        }catch (Exception e){
            welcome.setFooVersion("Unknown");
        }

        return welcome;
    }
}
