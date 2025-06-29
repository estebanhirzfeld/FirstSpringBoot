package ar.edu.davinci.FirstSpringBoot.controller;

import ar.edu.davinci.FirstSpringBoot.model.User;
import ar.edu.davinci.FirstSpringBoot.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @GetMapping("/greetings/")
    public String greeting() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/greetings")
    public String greetings(@RequestParam String user) {
        return "Greetings " + user + "!";
    }

    @GetMapping("/greetings/{user}")
    public String greeting(@PathVariable String user) {
        return "Greetings " + user + "!";
    }

    @PostMapping("/greetings/body/")
    public String greetings(@RequestBody User user) {
        return "Greetings " + user.getName() + "!";
    }
}
