<div align="center">

# 📅 Appointment Booking App

**API RESTful para gerenciamento de agendamentos, construída com Spring Boot**

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.5-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![H2](https://img.shields.io/badge/H2%20Database-1E88E5?style=for-the-badge&logo=h2&logoColor=white)
![License](https://img.shields.io/badge/license-MIT-blue?style=for-the-badge)

</div>

---

## 📖 Sobre o projeto

O **Appointment Booking App** (nome interno `agendador-horarios`) é uma API RESTful desenvolvida com **Spring Boot** para o gerenciamento de agendamentos. O projeto implementa operações de **CRUD** (criar, listar, atualizar e remover) e segue boas práticas de arquitetura backend, servindo como base para um futuro sistema completo de agendamento de horários.

## 🚀 Tecnologias utilizadas

- **Java 17**
- **Spring Boot 4** (Web MVC)
- **Spring Data JPA** — persistência e acesso a dados
- **H2 Database** — banco de dados em memória para desenvolvimento/testes
- **H2 Console** — visualização do banco em tempo de execução
- **Lombok** — redução de boilerplate no código
- **Maven** — gerenciamento de dependências e build

## ✨ Funcionalidades

- ✅ Cadastro de novos agendamentos
- ✅ Listagem de agendamentos existentes
- ✅ Consulta de um agendamento específico
- ✅ Atualização de dados de um agendamento
- ✅ Remoção de agendamentos
- 🔜 Autenticação e autorização de usuários
- 🔜 Notificações de lembrete de horário
- 🔜 Regras de disponibilidade e conflito de horários

## 📂 Estrutura do projeto

```
appointment-booking-app/
├── src/
│   ├── main/
│   │   ├── java/com/devlucasnascimento/agendadorhorarios/
│   │   │   ├── controller/     # Camada de endpoints REST
│   │   │   ├── service/        # Regras de negócio
│   │   │   ├── repository/     # Interfaces de acesso a dados (JPA)
│   │   │   ├── model/          # Entidades do domínio
│   │   │   └── dto/            # Objetos de transferência de dados
│   │   └── resources/
│   │       └── application.properties
│   └── test/                   # Testes automatizados
├── pom.xml
└── README.md
```
> Estrutura de pastas ilustrativa — pode variar de acordo com a organização atual do código-fonte.

## ⚙️ Como executar o projeto

### Pré-requisitos

- [Java 17+](https://adoptium.net/)
- [Maven 3.8+](https://maven.apache.org/) (ou use o wrapper `mvnw` incluso no projeto)

### Passo a passo

```bash
# 1. Clone o repositório
git clone https://github.com/devlucasnascimento81/appointment-booking-app.git

# 2. Acesse a pasta do projeto
cd appointment-booking-app

# 3. Execute a aplicação com o Maven Wrapper
./mvnw spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

### 🗄️ Console do banco H2

Com a aplicação rodando, acesse o console do H2 em:

```
http://localhost:8080/h2-console
```

## 📡 Endpoints da API

| Método   | Rota                  | Descrição                          |
|----------|-----------------------|-------------------------------------|
| `POST`   | `/appointments`       | Cria um novo agendamento            |
| `GET`    | `/appointments`       | Lista todos os agendamentos         |
| `GET`    | `/appointments/{id}`  | Busca um agendamento pelo ID        |
| `PUT`    | `/appointments/{id}`  | Atualiza um agendamento existente   |
| `DELETE` | `/appointments/{id}`  | Remove um agendamento               |

> ⚠️ As rotas acima refletem o padrão CRUD do projeto e podem ser ajustadas conforme a implementação atual dos *controllers*.

## 🗺️ Roadmap

- [ ] Documentação com Swagger / OpenAPI
- [ ] Migração para banco de dados persistente (PostgreSQL/MySQL)
- [ ] Autenticação com Spring Security
- [ ] Testes de integração
- [ ] Deploy em ambiente cloud

## 🤝 Contribuindo

Contribuições são bem-vindas! Para contribuir:

1. Faça um *fork* do projeto
2. Crie uma *branch* para sua feature (`git checkout -b feature/nova-feature`)
3. Faça o *commit* das suas alterações (`git commit -m 'feat: adiciona nova feature'`)
4. Faça o *push* para a *branch* (`git push origin feature/nova-feature`)
5. Abra um *Pull Request*

## 📝 Licença

Este projeto está sob a licença MIT. Sinta-se livre para utilizá-lo e adaptá-lo.

## 👤 Autor

Desenvolvido por **[Lucas Nascimento](https://github.com/devlucasnascimento81)**

<div align="center">

⭐ Se este projeto te ajudou, considere deixar uma estrela no repositório!

</div>
