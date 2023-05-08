O Thymeleaf é um mecanismo de template que pode ser usado em projetos Java, especialmente em aplicações web desenvolvidas com o Spring Framework. Para utilizá-lo, é necessário seguir alguns passos:

1. Adicionar a dependência do Thymeleaf no arquivo de configuração do projeto. No caso do Maven, por exemplo, basta adicionar o seguinte trecho no arquivo `pom.xml:

```xml
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```
2. Criar um arquivo HTML que será utilizado como template. Nesse arquivo, é possível utilizar as tags do Thymeleaf para inserir dados dinamicamente. Por exemplo:

```html
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
  <title th:text="${title}">Título da página</title>
</head>
<body>
  <h1 th:text="${header}">Cabeçalho da página</h1>
  <ul>
    <li th:each="item : ${itens}" th:text="${item}"></li>
  </ul>
</body>
</html>
```
Nesse exemplo, estamos utilizando as tags `th:text`, `th:each` e `th:if`. A tag `th:text` é utilizada para substituir o conteúdo do elemento pelo valor de uma expressão Thymeleaf. A tag `th:each` é utilizada para iterar sobre uma coleção e gerar elementos HTML dinamicamente. A tag `th:if` é utilizada para renderizar ou não um elemento HTML de acordo com uma condição.

3. No código Java, é necessário fornecer os dados que serão utilizados para preencher o template. Isso pode ser feito através de um objeto `Model`, que é uma classe do Spring Framework. Por exemplo:
```java

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
```
Nesse exemplo, estamos utilizando a anotação `@Controller` para definir uma classe que será um controlador no Spring. A anotação `@GetMapping("/")` indica que essa classe será responsável por lidar com as requisições para a raiz do site. No método home, estamos adicionando três atributos ao objeto `Model: title`, `header` e `itens`. Por fim, estamos retornando o nome do arquivo HTML que será utilizado como template.

4. Por fim, é necessário configurar o Thymeleaf no arquivo de configuração do Spring (`application.properties`). Por exemplo:

```properties
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html
``` 

Nesse exemplo, estamos definindo que os arquivos HTML que serão utilizados como templates estarão dentro da pasta `/templates`, e que a extensão dos arquivos será `.html`.

Com esses passos, o Thymeleaf estará configurado e pronto para ser utilizado em projetos Java com Spring Framework.

#
#

O Thymeleaf é um motor de template Java que permite criar e renderizar templates HTML para aplicativos da web, além de ser um dos mecanismos de template padrão para o framework Spring. O Thymeleaf oferece recursos para adicionar atributos aos elementos HTML, escrever expressões, fazer loops e condicionais, e integrar com código Java no back-end.

Para usar o Thymeleaf em um projeto Spring Boot, basta adicionar a dependência do Thymeleaf ao arquivo pom.xml do projeto e configurar o Spring para usar o Thymeleaf como mecanismo de template padrão. Em seguida, é possível criar arquivos HTML usando a sintaxe do Thymeleaf e integrar com o código Java no back-end por meio de expressões.

Alguns recursos e funcionalidades do Thymeleaf incluem:

- Sintaxe intuitiva: o Thymeleaf usa uma sintaxe fácil de entender e ler, que se assemelha ao HTML puro, mas adiciona recursos para adicionar expressões e lógica.

- Escopo de variáveis: o Thymeleaf permite definir variáveis que podem ser usadas em diferentes partes do template.

- Condições e loops: o Thymeleaf permite adicionar condicionais e loops em templates, facilitando a exibição dinâmica de informações.

- Internacionalização: o Thymeleaf oferece recursos para lidar com internacionalização de aplicativos, permitindo a exibição de conteúdo em diferentes idiomas.

- Integração com Spring: o Thymeleaf é o mecanismo de template padrão do Spring, permitindo uma integração fácil com outros recursos do framework.

Em resumo, o Thymeleaf é uma ferramenta poderosa para criar templates HTML para aplicativos da web, oferecendo uma sintaxe intuitiva, recursos avançados e integração com o Spring Boot.
# thymeleafExample
