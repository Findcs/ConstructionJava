package ru.anton.test2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TestController {

    @GetMapping("/test")
    public String get(@RequestParam String name, @ModelAttribute("user") User user) {
        user.setFirstName(name);
        return "test";
    }

}
