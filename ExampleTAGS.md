As principais tags do Thymeleaf são:

1. `th:text`: define o texto que deve ser exibido dentro de um elemento HTML;

2. `th:if`: define uma condição para exibir ou não um elemento HTML;

3. `th:unless`: define uma condição para não exibir um elemento HTML;

4. `th:switch` e th:case: usados para definir uma estrutura condicional semelhante ao switch-case do Java;

5. `th:each`: usado para iterar sobre uma lista de objetos e exibir cada elemento em uma lista HTML;

6. `th:href`: define o valor do atributo href de um elemento HTML a;

7. `th:src`: define o valor do atributo src de um elemento HTML img;

8. `th:attr`: usado para definir o valor de qualquer outro atributo de um elemento HTML.

Aqui estão alguns exemplos de como usar essas tags em um arquivo HTML com o Thymeleaf:

```html
Copy code
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head>
    <title>Exemplo de Thymeleaf</title>
</head>

<body>
    <h1 th:text="${titulo}">Título padrão</h1>

    <div th:if="${condicao}">
        Esse conteúdo só será exibido se a condição for verdadeira.
    </div>
    
    <div th:unless="${condicao}">
        Esse conteúdo só será exibido se a condição for falsa.
    </div>
    
    <ul>
        <li th:each="item : ${listaDeItens}" th:text="${item}">Item padrão</li>
    </ul>
    
    <a th:href="@{/caminho/para/pagina}">
        Esse link leva para outra página.
    </a>
    
    <img th:src="@{/caminho/para/imagem.jpg}" />
    
    <div th:attr="data-valor=${valor}">Esse atributo foi definido dinamicamente.</div>
</body>

</html>
```


E aqui está um exemplo de como usar essas tags em um arquivo Java com o Thymeleaf:

```java
@Controller
public class ExemploController {

    @GetMapping("/exemplo")
    public String exemplo(Model model) {
        model.addAttribute("titulo", "Título da página");
        
        boolean condicao = true;
        model.addAttribute("condicao", condicao);
        
        List<String> listaDeItens = Arrays.asList("Item 1", "Item 2", "Item 3");
        model.addAttribute("listaDeItens", listaDeItens);
        
        int valor = 123;
        model.addAttribute("valor", valor);
        
        return "exemplo";
    }

}
```

Nesse exemplo, a página `"exemplo.html"` será renderizada com os valores passados pelo controlador Java.