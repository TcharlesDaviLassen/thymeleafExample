package com.refactorTest.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class MeuController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Minha página");
        model.addAttribute("header", "Bem-vindo à minha página");
        model.addAttribute("itens", Arrays.asList("item 1", "item 2", "item 3"));
        return "home";
    }
}
