💰 Fintech — Gestão de Despesas e Receitas
Aplicação Java para controle financeiro pessoal: registre, categorize e acompanhe suas despesas e receitas de forma simples e eficiente.

📋 Sobre o Projeto
O Fintech é uma aplicação desenvolvida em Java com foco em gestão financeira pessoal. Utiliza JDBC para persistência em banco de dados relacional e segue o padrão arquitetural DAO (Data Access Object). O sistema permite cadastrar e gerenciar usuários, contas, receitas, despesas, investimentos, metas e transações financeiras.

✨ Funcionalidades
✅ Cadastro e pesquisa de usuários
✅ Gerenciamento de contas (Account)
✅ Registro de receitas (Income) e despesas (Expense)
✅ Controle de investimentos (Investment)
✅ Definição e acompanhamento de metas financeiras (Goal)
✅ Histórico de transações (Transaction)
✅ Persistência em banco de dados via JDBC
✅ Tratamento de exceções customizadas
🛠️ Tecnologias Utilizadas
Tecnologia	Descrição
Java 17+	Linguagem principal
JDBC	Conexão e persistência no banco de dados
Maven	Gerenciador de dependências (pom.xml)
SQL	Banco de dados relacional
Padrão DAO	Separação da lógica de acesso a dados
IntelliJ IDEA	IDE utilizada no desenvolvimento
Utiliza JDBC para persistência em banco de dados relacional, sem frameworks externos.

📁 Estrutura do Projeto
Fintech2/
├── src/
│   └── main/
│       └── java/
│           └── br/com/fiap/
│               ├── dao/
│               │   └── UsuarioDao.java
│               ├── exception/
│               │   └── EntidadeNaoEncontradaException.java
│               ├── factory/
│               │   └── ConnectionFactory.java
│               ├── model/
│               │   ├── Account.java
│               │   ├── Expense.java
│               │   ├── Goal.java
│               │   ├── Income.java
│               │   ├── Investment.java
│               │   ├── Transaction.java
│               │   └── Usuario.java
│               └── view/
│                   ├── AppView.java
│                   ├── CadastrarUsuarioView.java
│                   ├── ListarUsuarioView.java
│                   ├── PesquisaUsuarioPorIdView.java
│                   └── App.java
├── pom.xml
└── README.md
🚀 Como Executar
Pré-requisitos
Java 17 ou superior instalado
Maven instalado
Banco de dados configurado (Oracle / MySQL)
Git instalado
Passo a passo
# 1. Clone o repositório
git clone https://github.com/NubiaGessi/fintech2-java.git

# 2. Acesse a pasta do projeto
cd fintech2-java

# 3. Configure a conexão com o banco em ConnectionFactory.java

# 4. Compile e execute com Maven
mvn compile
mvn exec:java -Dexec.mainClass="br.com.fiap.view.App"
🏛️ Arquitetura
O projeto segue o padrão DAO (Data Access Object), separando as responsabilidades em camadas:

Camada	Pacote	Responsabilidade
Model	br.com.fiap.model	Entidades do domínio (Usuario, Account, Expense...)
DAO	br.com.fiap.dao	Acesso e persistência no banco de dados
View	br.com.fiap.view	Interface com o usuário (menus e interações)
Factory	br.com.fiap.factory	Gerenciamento da conexão JDBC
Exception	br.com.fiap.exception	Exceções customizadas do sistema
🤝 Contribuindo
Contribuições são bem-vindas! Para contribuir:

Faça um fork do projeto
Crie uma branch para sua feature (git checkout -b feature/minha-feature)
Faça o commit das suas alterações (git commit -m 'feat: adiciona minha feature')
Faça o push para a branch (git push origin feature/minha-feature)
Abra um Pull Request
👩‍💻 Autora
Feito com ❤️ por Nubia Gessi

GitHub