# Sistema WEB de Controle de Estoque

## Integrantes do Grupo
- José
- Rafael
- Taís

---

# Divisão das Atividades

## José — Backend: Mercadorias e Estoque

Responsável pelo desenvolvimento da parte de mercadorias e controle de estoque no backend.

### Atividades
- Criar Model/Classe de Mercadoria
- Criar Controller de Mercadoria
- Criar Service de Mercadoria
- Criar Repository/DAO de Mercadoria
- Implementar:
  - Cadastro de mercadoria
  - Listagem de mercadorias
  - Edição de mercadorias
  - Exclusão de mercadorias
- Implementar regra para:
  - Não exibir mercadorias com quantidade igual a 0
  - Recalcular quantidade em estoque quando uma mercadoria for deletada
- Configurar os campos:
  - Nome
  - Descrição
  - Data de validade
  - Data de cadastro
  - Fornecedor
  - Quantidade

---

## Rafael — Backend: Fornecedores e Login

Responsável pelo desenvolvimento da parte de fornecedores e autenticação do sistema.

### Atividades
- Criar Model/Classe de Fornecedor
- Criar Controller de Fornecedor
- Criar Service de Fornecedor
- Criar Repository/DAO de Fornecedor
- Implementar:
  - Cadastro de fornecedores
  - Listagem de fornecedores
  - Edição de fornecedores
  - Exclusão de fornecedores
- Desenvolver funcionalidade para:
  - Exibir todas as mercadorias de um fornecedor específico
- Criar:
  - Tela de login
  - Lógica de autenticação
  - Controle de acesso às telas do sistema
- Configurar os campos:
  - Nome do fornecedor
  - Contato
  - Endereço

---

## Taís — Frontend, Interface e Apresentação

Responsável pelo frontend, integração visual do sistema e apresentação final do projeto.

### Atividades
- Desenvolver:
  - Tela de login
  - Tela de adicionar mercadoria
  - Tela de editar mercadoria
  - Tela de listagem de mercadorias
  - Tela de adicionar fornecedor
  - Tela de editar fornecedor
  - Tela de listagem de fornecedores
  - Tela para listar mercadorias por fornecedor
- Implementar:
  - Botões de editar e excluir
  - Exibição da quantidade em estoque
- Organizar:
  - Layout do sistema
  - Responsividade
  - Estilização com HTML, CSS e JavaScript/Framework
- Realizar:
  - Testes gerais do sistema
  - Ajustes finais
  - Preparação da apresentação
- Adicionar:
  - Nome dos integrantes no projeto

---

# Tecnologias Utilizadas
- Java 21
- Spring Boot
- HTML
- CSS
- JavaScript
- Banco de Dados PostgreSQL

---

# Observações
- O projeto segue o padrão MVC (Model View Controller)
- O projeto utiliza orientação a objetos no backend e frontend
- O sistema deve estar funcionando corretamente para avaliação
