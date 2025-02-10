# Monitoramento De Tarefas

Projeto de uma aplicação para monitorar tarefas e exibir estatisticas.

## Funcionalidades

- Cadastrar/AlterarStatus/Excluir Tarefa
- Consulta Tarefa específica
- Exibir estatisticas (Total De Tarefas, Quantidade Concluida, Quantidade Em Andamento, Percentual concluido)
- API documentada
- Dados salvos em memória

## Requisitos

- Java JDK 21
- Apache Maven = 3.9.9
- Docker
- GIT

## Principais Tecnologias Utilizadas

- Java 21
- Spring
- Maven
- Swagger
- Docker

## Manual de Configuração
```
git clone [https://github.com/lucashcotta/Desafio-monitor-de-tarefas.git](https://github.com/lucashcotta/Desafio-monitor-de-tarefas.git)

```
Para executar a aplicação
```
docker-compose up -d

```

O comando acima irá criar o contaniner docker necessário para o funcionamento da aplicação.

### Monitoramento_tarefas
Container com a API Monitoramento-api

### Documentação API
Para saber mais sobre os serviços disponiveis na API e suas respectivas URLs, acesse:

http://localhost:8080/swagger-ui.html#/
