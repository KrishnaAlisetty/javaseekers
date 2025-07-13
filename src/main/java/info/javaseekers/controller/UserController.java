package info.javaseekers.controller;

import info.javaseekers.entity.User;
import info.javaseekers.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usr")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/save")
    public void saveUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return userService.fetchAllUsers();
    }
}
