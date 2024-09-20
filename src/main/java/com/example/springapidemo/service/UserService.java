package com.example.springapidemo.service;

import com.example.springapidemo.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> usersList;

    public UserService() {
        usersList = new ArrayList<>();

        User user1 = new User(1, "Joeson", "jitson@gmail.com", 5);
        User user2 = new User(2, "Julia", "juliahu@gmail.com", 19);
        User user3 = new User(3, "Bruce", "brucele@gmail.com", 20);
        User user4 = new User(4, "Zach", "zach@gmail.com", 23);

        usersList.addAll(Arrays.asList(user1, user2, user3, user4));

    }
    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user : usersList) {
            if (user.getId() == id) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
