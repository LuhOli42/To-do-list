<p align="center"><b>To'Do API - Gerenciadora de listas de tarefas</b></p>


## About

Esse projeto foi realizado como desafio de java para o curso JAVA DIO.


## Features

- Cadastrar tarefa
- Deletar tarefa
- Listar todas tarefas
- Listar uma tarefa

## Techs

- Java
- Sprinboot
- h2 database


## Routes

#### `Get` `/task`

Lista todas as tarefas


#### `POST` `/task`

Cadastra Uma task

- **Requisição**  
  O corpo (body) deverá possuir um objeto com as seguintes propriedades (respeitando estes nomes):

  - title
  - description
 

#### `Get` `/task/{id}`

Lista uma unica tarefa através do parametro id

#### `Delete` `/task/{id}`

Deleta uma unica tarefa através do parametro id
