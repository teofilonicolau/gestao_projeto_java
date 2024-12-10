# Gestão de Projetos
![image](https://github.com/user-attachments/assets/b54a9d22-aca0-4428-bfcd-f85c764040cd)


## Descrição
Este projeto é um sistema de gestão de projetos em Java utilizando Programação Orientada a Objetos (POO). Ele permite a criação de projetos e a associação de pessoas a esses projetos, garantindo que a relação entre pessoas e projetos seja bidirecional.

## Estrutura do Projeto
- **Classe Projeto**:
  - **Atributos**: 
    - `nome`: Nome do projeto.
    - `membros`: Lista de objetos do tipo `Pessoa`.
  - **Métodos**: 
    - `adicionarMembro(Pessoa pessoa)`: Adiciona uma pessoa à lista de membros do projeto e associa o projeto à pessoa.
    - `listarMembros()`: Lista todos os membros do projeto.

- **Classe Pessoa**:
  - **Atributos**: 
    - `nome`: Nome da pessoa.
    - `projetos`: Lista de objetos do tipo `Projeto`.
  - **Métodos**: 
    - `adicionarProjeto(Projeto projeto)`: Adiciona um projeto à lista de projetos da pessoa e associa a pessoa ao projeto.

## Funcionalidades
- Adição de membros a projetos.
- Listagem de membros de um projeto.
- Associa automaticamente projetos e membros de forma bidirecional.

## Como Executar
1. Clone o repositório do GitHub:
   ```bash
   git clone https://github.com/teofilonicolau/gestao_projeto_java.git
   
   ```
 2. Navegue até o diretório do projeto:
  ```bash
   cd gestao_projeto_java
 ```
3. Compile e execute o projeto utilizando o IntelliJ IDEA ou os seguintes comandos Maven:
   
    
 - mvn clean install
 - mvn exec:java -Dexec.mainClass="com.example.gestaoprojetos.Main"


## Tecnologias Utilizadas
 - Java

 - Maven

- IntelliJ IDEA



 
  

   
 
  
   
