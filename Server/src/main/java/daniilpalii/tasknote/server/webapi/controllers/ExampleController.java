package daniilpalii.tasknote.server.webapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/api/greeting")
    public String sayHello() {
        return "Greetings from Spring Boot!";
    }

}
