### Tarefas - Projeto com Spring Boot, JPA, MongoDB, MariaDB e H2
Este projeto é uma aplicação de gerenciamento de tarefas com Spring Boot, que suporta três bancos de dados: MongoDB, MariaDB e H2. A escolha do banco de dados ativo é feita através de perfis Spring, permitindo que o banco seja alterado de maneira simples.

## Estrutura do Projeto
- Model: Contém a classe Tarefa que representa a entidade da aplicação.
- Repository: Contém repositórios para persistir dados em bancos relacionais (MariaDB/H2) e MongoDB.
- Service: Contém a lógica de negócios, com duas implementações: uma para bancos relacionais e outra para MongoDB.
- Controller: Controlador REST que expõe a API para interação com a aplicação.

## Configuração
1. Banco de Dados Relacional (MariaDB ou H2)
Você pode escolher entre MariaDB ou H2 no arquivo application.properties.

## Como Rodar a Aplicação
1. Clone o repositório:
2. Instale as dependências: Se estiver usando o Maven:
    mvn clean install
3. Rode a aplicação com o banco escolhido:

## Endpoints
GET /tarefas: Lista todas as tarefas.
POST /tarefas: Cria uma nova tarefa.
PUT /tarefas/{id}: Atualiza uma tarefa existente.
DELETE /tarefas/{id}: Exclui uma tarefa.

## Dependências
- Spring Boot 2.x
- Spring Data JPA (para MariaDB/H2)
- Spring Data MongoDB (para MongoDB)
- Lombok
- Validation API