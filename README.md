<h2>Bookstore API Manager</h2>

O objetivo do projeto Bookstore API Manager é disponibilizar uma API para cadastro dos livros de uma livraria através de uma API REST.

O projeto foi desenvolvido como base de criação do curso intrdutório sobre Spring Boot, publicado na Udemy em abril de 2020.

Durante o projeto, são abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr.
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados.
* Desenvolvimento de operações de gerenciamento de livros (Cadastro, leitura por ID e remoção de livros).
* Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários para validação das funcionalidades.
* Implantação do sistema na nuvem através do Heroku.

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/books
```

Para abrir a documentação (disponibilizada através do Swagger 2) de todas as operações implementadas com o padrão arquitetural REST, acesse o seguinte link abaixo:

```
http://localhost:8080/api/v1/books/swagger-ui.html
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido durante a aula:

* Java 14 ou versões superiores.
* Maven 3.6.3 ou versões superiores.
* SDKMan! para o gerenciamento de múltiplcas versões de Java, Maven e Spring Boot.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Swagger 2 para a documentação de todos os endpoints desenvolvidos dentro do projeto.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem
* Postman para execução de testes de integração para a validação de ponta a ponta da API.

Abaixo, segue o link do projeto implantado no Heroku:
 
```
https://bookapi-course.herokuapp.com/swagger-ui.html
```

O link da documentação no Heroku, implementada também atraves do Swagger, está no link abaixo:
 
```
https://bookapi-course.herokuapp.com/swagger-ui.html
```

