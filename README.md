# 🏦 Sistema Bancário em Java – Versão POO (Refatorada)

Este repositório contém a versão evoluída do meu Sistema Bancário, agora totalmente refatorado utilizando **Programação Orientada a Objetos (POO)**.  
O objetivo desta nova versão é demonstrar minha evolução em Java através de uma arquitetura mais profissional, modular e alinhada ao que é usado em sistemas reais.

---

## 🚀 Evolução do Projeto

Esta versão representa um salto significativo em relação ao projeto inicial (versão estruturada), evoluindo de:

❌ Código monolítico no `main`  
❌ Variáveis soltas  
❌ Fluxo rígido  
❌ Difícil manutenção  

para:

✅ Arquitetura em camadas  
✅ Classes modelando entidades reais (Conta, Transação, Investimento)  
✅ Controllers responsáveis pela lógica de negócio  
✅ Menu principal centralizando as operações  
✅ Sistema expansível sem quebrar funcionalidades  

---

## 🧱 Arquitetura Utilizada

O projeto segue uma abordagem semelhante ao **MVC simplificado**, organizado em:

/view
└── Main.java (interface console)

/controller
├── ContaController.java
├── TransacaoController.java
└── InvestimentoController.java

/model
├── ContaModel.java
├── TransacaoModel.java
└── InvestimentoModel.java 


Essa organização torna o código:

- mais limpo  
- mais fácil de manter  
- mais testável  
- mais próximo de aplicações bancárias reais  

---

## 🔍 Funcionalidades Implementadas

### 🧾 **Menu Principal**
O usuário pode:

✔ Criar uma conta  
✔ Consultar dados da conta  
✔ Acessar o menu de transações  
✔ Acessar o menu de investimentos  
✔ Encerrar a aplicação com confirmação  

---

## 💰 Transações

Gerenciadas pelo **TransacaoController**, incluem:

✔ Enviar dinheiro  
✔ Receber dinheiro  
✔ Verificar saldo antes de enviar  
✔ Loops de confirmação  
✔ Submenu exclusivo para operações  

---

## 📈 Investimentos

Implementado pelo **InvestimentoController**, oferecendo:

✔ Realizar investimento  
✔ Consultar valores investidos  
✔ Validação de valores informados  
✔ Armazenamento de dados via InvestimentoModel  

---

## 👤 Gerenciamento de Conta

Feito pelo **ContaController**, responsável por:

✔ Criar conta  
✔ Consultar informações  
✔ Alterar dados da conta  
✔ Deletar conta com confirmação  
✔ Manter estado da conta durante toda a execução  

---

## 🎯 Objetivo Educacional

Este projeto foi desenvolvido para:

📘 Consolidar conceitos de POO  
⚙️ Trabalhar lógica e validações  
🏛 Simular um sistema bancário realista  
🏦 Demonstrar entendimento de arquitetura aplicada  

---

## 🛠 Tecnologias Utilizadas

- **Java 17+**
- **Scanner** para entrada de dados
- Conceitos fundamentais:
  - Encapsulamento  
  - Construtores  
  - Objetos compartilhados entre controllers  
  - Estrutura de pacotes  
  - Switch-case organizado  

