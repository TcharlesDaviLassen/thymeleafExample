package com.refactorTest.test.controller;

import com.refactorTest.test.model.Produto;
import com.refactorTest.test.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
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

        //
        User user = new User();
        model.addAttribute("user", user);

        //
        model.addAttribute("produto", new Produto(1L, "Produto Teste"));

        //
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(2L,"Produto 1"));
        produtos.add(new Produto(3L,"Produto 2"));
        model.addAttribute("produtos", produtos);

        //        String path = "/home/flexabus/Projects_Test/test/src/main/resources/assets/ubuntu-kudu-wallpaper.jpg";
        //        String imageName = "example.jpg";
        //        model.addAttribute("path", path);
        //        model.addAttribute("imageName", imageName);

        return "home";
    }
}
