package org.example.controller;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestParam String username,
                                         @RequestParam String password,
                                         @RequestParam String email) {
        return ResponseEntity.ok(userService.register(username, password, email));
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestParam String username,
                                      @RequestParam String password) {
        return ResponseEntity.ok(userService.login(username, password));
    }
}
