package com.example.GIK2F7.Lab6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    private User user1 = new User("a", "Hoola", "Bananvägen 1", 27);
    private User user2 = new User("b", "Bandoola", "Bananvägen 2", 77);
    private User user3 = new User("c", "Band", "Bananvägen 6", 23);

    private User[] userList = {user1, user2, user3};

    @RequestMapping("userapp/users")
    public String page(Model model) {
        model.addAttribute("user",userList);
        return "urlview";
    }

    @RequestMapping("userapp/users/{id}")
    public String userview (Model model, @PathVariable(required = false) String id) {
        for (User user : userList) {
            if (id.equals(user.getId())) {
                model.addAttribute("user",user);
            }
        }
        return "userview";
    }
}
