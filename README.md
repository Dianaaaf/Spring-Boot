# Avaliação 01 – Spring Boot + MariaDB
Este projeto tem como objetivo demonstrar a implementação de uma API REST usando **Spring Boot** com persistência de dados em **MariaDB** e seguindo o padrão **MVC**.
---

## Estrutura do Projeto
- `model/` – Entidades `Autor` e `Livro`.
- `repository/` – Interfaces `JpaRepository` para ambas as entidades.
- `service/` – Regras de negócio e lógica CRUD.
- `controller/` – Controladores REST.
- `resources/application.properties` – Configurações de banco de dados e da aplicação.
---

## Endpoints REST
### Autor
- `GET /api/autores`
- `GET /api/autores/{id}`
- `POST /api/autores`
- `PUT /api/autores/{id}`
- `DELETE /api/autores/{id}`
### Livro
- `GET /api/livros`
- `GET /api/livros/{id}`
- `POST /api/livros`
- `PUT /api/livros/{id}`
- `DELETE /api/livros/{id}`
---

## Instalação e Configuração do MariaDB
1. **Instale o MariaDB**:
   - No Windows:  
     Baixe o instalador no site oficial: [https://mariadb.org/download/](https://mariadb.org/download/)
---

## Como Rodar o Projeto
1. **Clone o repositório e o projeto**:
   ```bash
   git clone https://github.com/Dianaaaf/Spring-Boot/
   cd Avaliacao01
   ```
2. **Importe na IDE** 
3. **Execute a aplicação**:
   - Pelo terminal:
     ```bash
     ./mvnw spring-boot:run
     ```
     Ou pela sua IDE (botão “Run” no Avaliacao01Application.java)
---

## Como Testar os Endpoints
Você pode testar os endpoints com ferramentas como **Postman**, **Insomnia** ou **curl**.
### Exemplo com `curl`:
```bash
curl -X POST http://localhost:8080/api/autores -H "Content-Type: application/json" -d '{"nome":"Machado de Assis", "nacionalidade":"Brasileiro"}'
```
### Exemplo com Postman/ Insomnia:
- Crie uma requisição `POST` para `http://localhost:8080/api/livros`
- Corpo (JSON):
```json
{
  "titulo": "Dom Casmurro",
  "genero": "Romance",
  "autor": {
    "id": 1
  }
}
```
---

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- MariaDB
- Lombok
- Maven

## Funcionamento dos testes do projeto
![Meu projeto rodando](assets/DemonstraçãoProjeto.gif)
