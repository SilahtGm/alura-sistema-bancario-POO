#🏦 Sistema Bancário em Java – Versão POO (Refatorada)

Este repositório contém a versão evoluída do meu Sistema Bancário, agora totalmente refatorado utilizando Programação Orientada a Objetos (POO).
O objetivo desta nova versão é demonstrar minha progressão em Java através de uma arquitetura mais profissional, modular e próxima do que é usado em sistemas reais.

🚀 Evolução do Projeto

Esta versão representa um salto significativo em relação ao projeto inicial (versão estruturada), evoluindo de:

❌ Código monolítico no main
❌ Variáveis soltas
❌ Fluxo rígido
❌ Dificuldade de manutenção

para:

✅ Arquitetura em camadas
✅ Classes modelando entidades reais (Conta, Transação, Investimento)
✅ Controllers responsáveis pela lógica de negócio
✅ Menu principal organizando tudo como um sistema bancário verdadeiro
✅ Possibilidade de expansão sem quebrar nada

🧱 Arquitetura Utilizada

O projeto segue uma abordagem semelhante ao padrão MVC simplificado, organizado em:

/view
   → Main.java (interface console)
/controller
   → ContaController.java
   → TransacaoController.java
   → InvestimentoController.java
/model
   → ContaModel.java
   → TransacaoModel.java
   → InvestimentoModel.java


Essa divisão torna o código:

mais limpo

mais testável

mais fácil de manter

mais próximo de aplicações bancárias reais

🔍 Funcionalidades Implementadas
🧾 Menu Principal

O usuário pode:

✔ Criar uma conta
✔ Consultar dados da conta
✔ Acessar o menu de transações
✔ Acessar o menu de investimentos
✔ Encerrar a aplicação com confirmação

💰 Transações

Gerenciadas pelo TransacaoController, incluem:

✔ Enviar dinheiro
✔ Receber dinheiro
✔ Validar saldo suficiente
✔ Loops de confirmação
✔ Submenu exclusivo para operações

📈 Investimentos

Implementado com o InvestimentoController, oferecendo:

✔ Realizar investimento
✔ Consultar informações já investidas
✔ Validação de valores
✔ Armazenamento via InvestimentoModel

👤 Gerenciamento de Conta

O ContaController é responsável por:

✔ Criar conta
✔ Consultar dados
✔ Alterar informações da conta
✔ Deletar conta com confirmação
✔ Manter o estado enquanto o sistema está ativo

🎯 Objetivo Educacional

Este projeto foi criado para:

📘 Consolidar conceitos de POO na prática
🏛 Simular um sistema bancário realista
⚙️ Trabalhar lógica, validação e fluxo de menus
🏦 Demonstrar entendimento de arquitetura aplicada 

🛠 Tecnologias Utilizadas

Java 17+

Scanner para entrada de dados

Conceitos de:

Encapsulamento

Construtores

Objetos compartilhados entre controllers

Switch-case modularizado

Estrutura de pacotes
