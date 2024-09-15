package com.example.user_service.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user_service.models.UserModel;
import com.example.user_service.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private UserService service = new UserService();

    @GetMapping("all")
    public List<UserModel> getHistory() {
        return service.getAll();
    }
}