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
