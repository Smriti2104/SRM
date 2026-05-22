package jar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.model.User;
import jar.repo.UserRepo;

@RestController
public class Alluser {

    @Autowired
    UserRepo db;

    @GetMapping("/api/allusers")
    public List<User> getAllUsers() {

        return db.findAll();
    }
}