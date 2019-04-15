package controller;

import model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {

    @RequestMapping("rest")
    public User rest() {
        User user = new User("haili", "1234567");
        return user;
    }

    @RequestMapping("rest2/{username}")
    public User rest2(@PathVariable String username) {
        User user = new User(username, "1234567");
        return user;
    }
}
