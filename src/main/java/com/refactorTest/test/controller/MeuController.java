package com.refactorTest.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class MeuController {

    @GetMapping("/")
    public String home(Model model) {
        //
        model.addAttribute("title", "Minha página");
        //
        model.addAttribute("header", "Bem-vindo à minha página");
        //
        model.addAttribute("itens", Arrays.asList("item 1", "item 2", "item 3"));
        //
        model.addAttribute("diaSemana", "*");
        //
        boolean condicao = true;
        model.addAttribute("condicao", condicao);
        //
        List<String> listaDeItens = Arrays.asList("Item 1", "Item 2", "Item 3");
        model.addAttribute("listaDeItens", listaDeItens);
        //
        int valor = 123;
        model.addAttribute("valor", valor);


        //        model.addAttribute("produto", new Produto(1, "Produto Teste"));

        //        String path = "/home/flexabus/Projects_Test/test/src/main/resources/assets/ubuntu-kudu-wallpaper.jpg";
        //        String imageName = "example.jpg";
        //        model.addAttribute("path", path);
        //        model.addAttribute("imageName", imageName);

        return "home";
    }
}
