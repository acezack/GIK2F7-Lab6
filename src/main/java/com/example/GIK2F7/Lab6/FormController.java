package com.example.GIK2F7.Lab6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class FormController {
    @RequestMapping("/userform")
    public String userform(Model model) {
        return "userform";
    }

    @PostMapping("/formhandling")
    public String formhandling(Model model, @RequestParam Map<String, String> allFormRequestParams) {
        model.addAttribute("firstname", allFormRequestParams.get("first_name"));
        model.addAttribute("entryset", allFormRequestParams.entrySet());
        model.addAttribute("keyset", allFormRequestParams.keySet());
        model.addAttribute("values", allFormRequestParams.values());

        return "/formhandling";
    }
}
