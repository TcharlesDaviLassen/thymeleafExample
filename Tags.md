#### O Thymeleaf possui uma grande quantidade de tags para diferentes finalidades. Abaixo, listo todas as tags do Thymeleaf, agrupadas por funcionalidade:

# Expressões e Variáveis
- `th:utext`: Define o conteúdo de um elemento HTML com uma expressão Thymeleaf, mas não codifica os caracteres especiais.
- `th:text`: Define o conteúdo de um elemento HTML com uma expressão Thymeleaf.
- `th:value`: Define o valor de um atributo de um elemento HTML com uma expressão Thymeleaf.
- `th:field`: Define o valor de um campo de formulário com uma expressão Thymeleaf, e também define o atributo name do campo de acordo com o objeto e o campo.
- `th:object`: Define o objeto de contexto atual para um bloco de marcação.
- `th:with`: Define uma variável local no contexto atual.
- `th:each`: Repete um bloco de marcação para cada elemento de uma lista ou array.
- `th:if`: Renderiza um bloco de marcação condicionalmente, baseado em uma expressão booleana.
- `th:unless`: Renderiza um bloco de marcação condicionalmente, baseado em uma expressão booleana negada.
- `th:switch`: Define um bloco de marcação que implementa um switch-case.
- `th:case`: Define um caso dentro de um bloco th:switch.
- `th:default`: Define um caso padrão dentro de um bloco th:switch.
- `th:fragment`: Define um fragmento de marcação que pode ser referenciado em outros templates.

# Atributos
- `th:attr`: Define um ou mais atributos de um elemento HTML com uma expressão Thymeleaf.
- `th:replace`: Substitui completamente um elemento HTML por outro, que é especificado com uma expressão Thymeleaf.
- `th:insert`: Insere o conteúdo de um elemento HTML dentro de outro, que é especificado com uma expressão Thymeleaf.
- `th:remove`: Remove completamente um elemento HTML.

# Links e URLs
- `th:href`: Define o valor do atributo href de um elemento HTML com uma URL construída com uma expressão Thymeleaf.
- `th:src`: Define o valor do atributo src de um elemento HTML com uma URL construída com uma expressão Thymeleaf.
- `th:action`: Define o valor do atributo action de um formulário com uma URL construída com uma expressão Thymeleaf.

# Internacionalização
- `th:text`: Permite a internacionalização de textos em templates.
- `th:utext`: Permite a internacionalização de textos em templates, sem codificação de caracteres especiais.
- `th:lang`: Define o idioma atual do template.
- `th:messages`: Define um bloco de marcação que é renderizado de acordo com as mensagens de um arquivo de mensagens.

# Layouts
- `th:include`: Inclui o conteúdo de outro template dentro do atual.
- `th:replace`: Substitui completamente o conteúdo atual pelo de outro template.
- `th:insert`: Insere o conteúdo de outro template dentro do atual.
- `th:remove`: Remove completamente o conteúdo atual.

# Iteração e Condições
- `th:each`: Repete um bloco de marcação para cada elemento de uma lista

#
#

#### O Thymeleaf possui diversas tags que permitem a manipulação de dados e a criação de elementos HTML dinamicamente. Abaixo estão algumas das principais tags do Thymeleaf, com exemplos em Java e HTML:

`th:text` - Define o texto de um elemento HTML:
- 
```html
<p th:text="${nome}"></p>
```

`th:if` - Renderiza o elemento HTML somente se uma condição for verdadeira:

```html
<div th:if="${condicao}">
    ...
</div>
```

`th:each` - Renderiza um bloco de elementos HTML para cada item de uma lista:

```html
<ul>
    <li th:each="item : ${lista}">
        <span th:text="${item}"></span>
    </li>
</ul>
```

- `th:href` - Define o valor do atributo href de um elemento HTML:
  
```html
<a th:href="@{/pagina/{id}(id=${item.id})}"></a>
```

- `th:src` - Define o valor do atributo src de um elemento HTML:
  
```html
<img th:src="@{/imagem.png}">
```

- `th:value` - Define o valor do atributo value de um elemento HTML:
  
```html
<input type="text" th:value="${valor}">
```

- `th:selected` - Define se um elemento HTML de uma lista deve ser selecionado:
  
```html
<option th:selected="${item.selecionado}"></option>
```

- `th:classes` - Define as classes CSS de um elemento HTML:
  
```html
<div th:classes="${classe1} ${classe2}"></div>
```

- `th:style` - Define o estilo CSS de um elemento HTML:
  
```html
<div th:style="'color: ' + ${cor}"></div>
```

Essas são apenas algumas das tags mais comuns do Thymeleaf. A documentação oficial do Thymeleaf contém uma lista completa de todas as tags e suas funcionalidades.

#
#

O `th:attr` é uma diretiva do Thymeleaf que permite adicionar ou modificar atributos HTML de uma tag. Isso pode ser útil em situações em que você precisa modificar o valor de um atributo ou adicionar um novo atributo a uma tag.

O `th:attr` pode ser usado de duas maneiras:

Adicionar um novo atributo a uma tag:

```bash
<div th:attr="data-custom-attr=${value}">
  ...
</div>
```

Neste exemplo, a diretiva th:attr adiciona um novo `atributo data-custom-attr` à tag `<div>`. O valor do atributo é definido pela variável `value`.

Modificar o valor de um atributo existente:

```html
<img src="img/myimage.jpg" th:attr="src=@{/newpath/myimage.jpg}">
```

Neste exemplo, a diretiva th:attr modifica o valor do atributo src da tag `<img>`. O novo valor é definido pela expressão `@{/newpath/myimage.jpg}`, que é uma expressão Thymeleaf que gera um URL relativo a partir da raiz do contexto da aplicação.

Em ambos os casos, a diretiva th:attr é usada para modificar ou adicionar atributos HTML a uma tag. É uma maneira útil de gerar dinamicamente o conteúdo HTML com base em dados do back-end ou em outras informações da aplicação.

#
#

O atributo `th:object` é usado no Thymeleaf para definir o objeto que será usado como contexto no template. Ele permite que as expressões sejam avaliadas em relação a esse objeto, ou seja, permite que você acesse as propriedades e métodos desse objeto diretamente em seu template.

Para usar o `th:object`, basta definir o nome do objeto na tag HTML onde ele será usado, como no exemplo abaixo:

```html
<form th:object="${usuario}" method="post" action="@{/usuario/save}">
  <input type="text" th:field="*{nome}" />
  <input type="email" th:field="*{email}" />
  <button type="submit">Salvar</button>
</form>
```

th:object: Define o objeto de contexto para o modelo Thymeleaf. Por exemplo, th:object="${user}" irá definir o objeto user como o objeto de contexto para a página.
```html

<form th:object="${user}">
  <input type="text" th:field="*{firstName}">
  <input type="text" th:field="*{lastName}">
</form>
```

Nesse exemplo, o objeto `usuario` é definido como contexto para o formulário. Isso significa que, ao usar a expressão `*{nome}`no campo de entrada do nome, o Thymeleaf irá buscar a propriedade nome no objeto usuario. O mesmo acontece para o campo de entrada do e-mail.

Note que o `th:field` também é usado nesse exemplo para definir o nome do campo que será preenchido com o valor do objeto. O `th:field` é usado em conjunto com o `th:object` para permitir a ligação de dados bidirecional entre o objeto e o formulário HTML.

Em resumo, o th:object é usado para definir o objeto que será usado como contexto no template e permite que você acesse as propriedades desse objeto diretamente em seu template. O th:field é usado para ligação de dados bidirecional entre o objeto e o formulário HTML.

#
#

Para usar a diretiva `th:selected` do Thymeleaf em um elemento `<option>`, podemos seguir o seguinte exemplo em Java:

Suponha que temos uma lista de opções que queremos exibir em um elemento <select> e queremos que uma opção específica seja selecionada por padrão. Para isso, primeiro precisamos adicionar as opções a um modelo em Java e depois passar esse modelo para o arquivo HTML. Então, podemos usar a diretiva th:each para iterar sobre a lista de opções e a diretiva th:selected para marcar a opção selecionada.

Exemplo em Java:

```java
    @GetMapping("/form")
    public String showForm(Model model) {
        List<String> options = Arrays.asList("Opção 1", "Opção 2", "Opção 3", "Opção 4");
        String selectedOption = "Opção 2"; // opção selecionada por padrão
        
        model.addAttribute("options", options);
        model.addAttribute("selectedOption", selectedOption);
        
        return "form";
    } 
```

No exemplo acima, estamos adicionando uma lista de opções ao modelo com o nome "options" e a opção selecionada por padrão com o nome "selectedOption".

Exemplo em HTML/Thymeleaf:

```html
    <select>
        <option 
            th:each="option : ${options}"
            th:value="${option}"
            th:text="${option}"
            th:selected="${option == selectedOption}"
        >Opção</option>
    </select>
```

No exemplo acima, estamos iterando sobre a lista de opções usando a diretiva th:each e adicionando cada opção como um elemento <option> no elemento <select>. A diretiva th:value define o valor da opção e a diretiva th:text define o texto exibido para a opção. A diretiva th:selected verifica se a opção atual é a opção selecionada por padrão definida em Java e marca a opção como selecionada, se for o caso.
