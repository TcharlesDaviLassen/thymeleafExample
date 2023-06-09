package com.refactorTest.test.controller;

import com.refactorTest.test.model.Produto;
import com.refactorTest.test.model.User;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.Console;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class MeuController {

    private LocalDate dataDeInscricao;

    @Autowired
    private ServletContext servletContext;

    @GetMapping("/")
    public String home(Model model) {
        //
        model.addAttribute("title", "Minha página");
        //
        model.addAttribute("header", "Bem-vindo à minha página");
        //
        model.addAttribute("itens", Arrays.asList("item 1", "item 2", "item 3"));
        //
        Date data = new Date();
        DateFormat dff = DateFormat.getDateInstance(DateFormat.FULL);
        String dia = String.valueOf(dff.format(data).split(",")[0]);
        System.out.println(dia);
        model.addAttribute("diaSemana", dia);
        //
        boolean condicao = true;
        model.addAttribute("condicao", condicao);

        boolean condicaoUn = true;
        model.addAttribute("condicaoUn", condicaoUn);
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
        produtos.add(new Produto(2L, "Produto 1"));
        produtos.add(new Produto(3L, "Produto 2"));
        model.addAttribute("produtos", produtos);

        // String path = "src/main/resources/assets/";
        // String imageName = "Captura.png";
        // model.addAttribute("path", path);
        // model.addAttribute("imageName", imageName);

        // File imagemArquivo = new File("./src/main/resources/templates/images/" +
        // nomeImagem);

        String assetsPath = servletContext.getRealPath("/static");
        model.addAttribute("assetsPath", assetsPath);
        //
        List<String> options = Arrays.asList(" ", "Opção 1", "Opção 2", "Opção 3", "Opção 4");
        String selectedOption = " "; // opção selecionada por padrão

        model.addAttribute("options", options);
        model.addAttribute("selectedOption", selectedOption);

        return "home";
    }

    // @GetMapping("/images")
    // public ModelAndView getImages() {
    //     String assetsPath = servletContext.getRealPath("src/main/resources/static");


    // }

}
