### As principais tags do Thymeleaf são:

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

#
#

As tags do Thymeleaf permitem a interação entre o HTML e o Java por meio de atributos e elementos específicos. Segue abaixo a lista das principais tags do Thymeleaf com exemplos em HTML e Java:

1. `th:text`: exibe o conteúdo de uma variável Java em um elemento HTML:

```html
    <h1 th:text="${titulo}">Título da Página</h1>
```
Java:
```java
    model.addAttribute("titulo", "Minha Página")
```

2. `th:if`: permite a exibição condicional de elementos HTML de acordo com uma expressão Java:

HTML:
```html
    <p th:if="${condicao}">Este parágrafo será exibido se a condição for verdadeira.</p>
```
Java:
```java
    model.addAttribute("condicao", true);
```
3. `th:unless`: funciona de forma inversa ao th:if, exibindo o elemento HTML apenas se a expressão Java for falsa:

HTML:
```html
    <p th:unless="${condicao}">Este parágrafo será exibido se a condição for falsa.</p>
```
Java:
```java
    model.addAttribute("condicao", false);
```
4. `th:switch`, `th:case` e `th:break`: permite a criação de estruturas condicionais mais complexas:

HTML:
```html
<div th:switch="${diaSemana}">
    <p th:case="'segunda-feira'">Hoje é segunda-feira.</p>
    <p th:case="'terça-feira'">Hoje é terça-feira.</p>
    <p th:case="'quarta-feira'">Hoje é quarta-feira.</p>
    <p th:case="'quinta-feira'">Hoje é quinta-feira.</p>
    <p th:case="'sexta-feira'">Hoje é sexta-feira.</p>
    <p th:case="'sabado'">Hoje é fim de semana.</p>
    <p th:case="'domingo'">Hoje é fim de semana.</p>
    <p th:case="*">Dia desconhecido.</p>
</div>
```

Java:
```java
    model.addAttribute("diaSemana", "quarta-feira");
```
5. `th:each`: permite a iteração sobre uma lista de objetos Java e a criação de elementos HTML dinamicamente:

HTML:
```html
<ul>
    <li th:each="produto : ${produtos}" th:text="${produto.nome}"></li>
</ul>
```
Java:
```Java
    List<Produto> produtos = new ArrayList<>();
    produtos.add(new Produto("Produto 1"));
    produtos.add(new Produto("Produto 2"));
    model.addAttribute("produtos", produtos);
```

6. `th:href` e `th:src`: permite a atribuição dinâmica de valores a atributos HTML, como o "href" de um link ou o "src" de uma imagem:

HTML
```html
<a th:href="@{/produto/{id}(id=${produto.id})}" th:text="${produto.nome}"></a>
<img th:src="@{/img/produto.jpg}" alt="Imagem do Produto">
```
Java:
```java
    model.addAttribute("produto", new Produto(1, "Produto Teste"));
```