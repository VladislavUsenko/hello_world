package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @GetMapping("/")
    public ModelAndView index() {
        String word = "";
        try {
            word = ReadDatabase.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> model = new HashMap<>();
        model.put("value", word);
        return new ModelAndView("index", model);
    }
}
