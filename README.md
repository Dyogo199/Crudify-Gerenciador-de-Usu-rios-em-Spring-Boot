# 🌟 Crudify – Gerenciador de Usuários em Spring Boot

![Java](https://img.shields.io/badge/Java-22-blue?logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.0-brightgreen?logo=springboot)
![H2 Database](https://img.shields.io/badge/Database-H2-lightgrey?logo=databricks)
![Status](https://img.shields.io/badge/Status-Concluído-success)

---

## 📌 Sobre o Projeto
O **Crudify** é um sistema de gerenciamento de usuários desenvolvido em **Java com Spring Boot**.  
O objetivo do projeto é demonstrar a implementação de um **CRUD completo (Create, Read, Update, Delete)** de forma organizada, utilizando boas práticas e recursos modernos da linguagem.

Este projeto foi inspirado no estudo de **arquitetura MVC**, **banco de dados H2 em memória** e integração com **API REST**.

---

## 🚀 Funcionalidades

- ✅ Criar novo usuário  
- ✅ Listar todos os usuários  
- ✅ Buscar usuário por ID  
- ✅ Atualizar dados do usuário  
- ✅ Deletar usuário existente  

---

## 🛠️ Tecnologias Utilizadas

- **Java 22** ☕  
- **Spring Boot 3.x**  
- **Spring Data JPA**  
- **Banco de Dados H2 (em memória)**  
- **Lombok**  
- **Maven**  
- **Postman** (para testes da API)  

---

## 📂 Estrutura do Projeto


src/main/java/com/java/projetoUsuario
 ┣ 📂 controller    # Endpoints da API
 ┣ 📂 service       # Regras de negócio
 ┣ 📂 repository    # Comunicação com o banco de dados
 ┣ 📂 infra/entitys # Entidades do sistema
 ┗ 📂 config        # Configurações adicionais
▶️ Como Executar o Projeto

## Clone este repositório:

git clone [https://github.com/seu-usuario/crudify-springboot.git](https://github.com/Dyogo199/Crudify-Gerenciador-de-Usu-rios-em-Spring-Boot.git)


Entre na pasta do projeto:

cd crudify-springboot


Compile e rode o projeto:

mvn spring-boot:run


Acesse a aplicação em:

http://localhost:8080

📬 Endpoints Disponíveis

POST /user → Criar usuário

GET /user → Listar todos

GET /user/{id} → Buscar por ID

PUT /user/{id} → Atualizar usuário

DELETE /user/{id} → Excluir usuário

🖼️ Demonstração

<img width="1338" height="686" alt="image" src="https://github.com/user-attachments/assets/2b50f72f-0264-4219-95d7-02535e25373c" />


📚 Aprendizados

Durante o desenvolvimento deste projeto, foi possível: Aplicar conceitos de POO no contexto do Spring Boot. Entender melhor a arquitetura MVC. Utilizar o H2 como banco em memória para testes rápidos. Praticar o uso do Postman para validar endpoints REST.

👨‍💻 Autor

Feito por por Dyogo Mondego


