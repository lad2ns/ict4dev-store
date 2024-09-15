package com.example.user_service.services;

import java.util.ArrayList;
import java.util.List;

import com.example.user_service.models.UserModel;

public class UserService {
    public List<UserModel> getAll() {
        List<UserModel> users = new ArrayList<>();

        users.add(new UserModel("1", "Charles Doven"));
        users.add(new UserModel("2", "Mark Banqimann"));

        return users;
    }
}
