package com.tangerine.monitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/monitoring")
public class MainController {

    @GetMapping(path = "/")
    public String main() {
        return "main";
    }

    @GetMapping(path = "/endpoint")
    public String endpoint() {
        return "endpoint";
    }

}
