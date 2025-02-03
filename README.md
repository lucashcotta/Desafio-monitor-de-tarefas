Desafio: API REST para Monitoramento de Tarefas

🔹 Tecnologias: Java | Spring Boot | REST API | Map (Armazenamento em Memória)

💡Construir uma API REST para Monitoramento de Tarefas, sem uso de banco de dados, apenas utilizando armazenamento em memória. O objetivo era aprimorar meus conhecimentos em Spring Boot e manipulação de dados sem persistência.

📌 Regras do Desafio

🔹 Criar uma API REST que permite:
✅ Cadastrar uma nova tarefa

✅ Listar todas as tarefas

✅ Buscar uma tarefa por ID

✅ Marcar uma tarefa como concluída

✅ Excluir uma tarefa

🔹 Regras de Negócio:

✔ Uma tarefa começa como "não concluída"

✔ Apenas o status da tarefa pode ser atualizado

✔ As tarefas devem ser armazenadas em memória (sem banco de dados)

🔥 Endpoints da API

📌 Criar uma Tarefa

POST /tarefas

📌 Listar todas as Tarefas

GET /tarefas

📌 Buscar uma Tarefa por ID

GET /tarefas/{id}

📌 Marcar como Concluída

PATCH /tarefas/{id}/concluir

📌 Excluir uma Tarefa

DELETE /tarefas/{id}
