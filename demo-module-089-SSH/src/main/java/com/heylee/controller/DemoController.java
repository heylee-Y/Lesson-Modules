package com.heylee.controller;

import com.heylee.dao.DemoUserDao;
import com.heylee.model.DemoUser;
import com.heylee.service.DemoUserService;
import com.heylee.util.LogUtil;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class DemoController {

    private Logger logger = LogUtil.getBusinessLogger();

    @Autowired
    private DemoUserService userService;

    @RequestMapping(value = {"/", "test"})
    public String test() {
        logger.info("test controller!!!");
        return "index";
    }

    /**
     * @param model ui
     * @return all of the users
     * @auther heylee
     */
    @RequestMapping("users")
    public String listUsers(ModelMap model) {

        List<DemoUser> list = userService.findAllUsers();

        model.addAttribute("users", list);
        return "users";
    }

    @RequestMapping("userss")
    public String listUsers2(ModelMap model) {

        List<DemoUser> list = userService.getAllUsers();

        model.addAttribute("users", list);
        return "users";
    }

    @RequestMapping("user")
    public String getUser(ModelMap model) {
        DemoUser demoUser = userService.getById(100L);

        List<DemoUser> list = new ArrayList<DemoUser>();
        list.add(demoUser);

        model.addAttribute("users", list);
        return "users";
    }

    @RequestMapping("update/{name}")
    public void update(@PathVariable String name) {
        DemoUser demoUser = new DemoUser();
        demoUser.setComment("update");
        demoUser.setName(name);
        userService.updateUser(demoUser);
    }
}
