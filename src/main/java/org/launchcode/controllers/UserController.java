package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Sarah on 4/6/2017.
 */

@Controller
@RequestMapping(value = "user")
public class UserController {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model){

        return "user/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(Model model, User user, String verify){
        if (user.getPassword().equals(verify)){
            model.addAttribute("title", "Welcome, " + user.getUsername() + "!");
            return "user/index";
        }
        else {
            model.addAttribute("username", user.getUsername());
            model.addAttribute("email", user.getEmail());
            model.addAttribute("error", "Password and Verify Password must match");
            return "user/add";
        }
    }

}
