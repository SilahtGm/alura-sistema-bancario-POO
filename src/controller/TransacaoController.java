package controller;

import model.ContaModel;
import model.TransacaoModel;

import java.util.Scanner;

public class TransacaoController {


    // Atributos
    private ContaModel conta;

    // Construtores
    public TransacaoController(ContaModel conta) {
        this.conta = conta;
    }


    // Instancias
    Scanner sc = new Scanner(System.in);
    TransacaoModel tm = new TransacaoModel();


    // Métodos
    public void menuTransacao() {
        while (true) {
            System.out.println("===== Menu de Transações =====");
            System.out.println("Operações:");
            System.out.println("1 - Enviar Dinheiro");
            System.out.println("2 - Receber Dinheiro");
            System.out.println("3 - Sair");
            System.out.print("Digite a opção desejada: ");

            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    enviarTransacao();
                    break;

                case 2:
                    receberTransacao();
                    break;

                case 3:
                    System.out.println("Saindo do Menu de Transações...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public void receberTransacao() {
        try {
            do {


                System.out.println("==== Sistema Bancário ====");
                System.out.print("Informe o valor que deseja receber: R$");
                tm.setValorRecebidoTransacao(sc.nextDouble());
                sc.nextLine();
                if (tm.getValorRecebidoTransacao() > 0) {
                    System.out.println("Transferindo " + tm.getValorRecebidoTransacao() + " para a sua conta...");
                    double novoSaldo = conta.getSaldo() + tm.getValorRecebidoTransacao();
                    conta.setSaldo(novoSaldo);
                    System.out.println("Transferência bem sucedida! Dinheiro recebido com sucesso.");
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
                } else {
                    System.out.println("Valor insuficiente. O valor digitado é abaixo de 1.");
                }

                System.out.println("==== Sistema Bancário ====");
                System.out.print("Deseja continuar com o procedimento? (CONFIRMAR) | (RECUSAR): ");
                String cr = sc.nextLine().trim().toUpperCase();
                if (cr.equals("CONFIRMAR")) {
                    System.out.println("Continuando processo de Transação.");
                } else if (cr.equals("RECUSAR")) {
                    System.out.println("Recusado. Voltando...");
                    break;
                } else {
                    System.out.println("Escreva corretamente. ");
                    continue;
                }
            } while (true);
        } catch (Exception e) {
            System.err.println("Erro, o sistema não processou bem essa requisição");
        }

    }

    public void enviarTransacao() {
        try {
            do {
                System.out.println("==== Sistema Bancário ====");
                System.out.print("Informe o numero da conta que deseja enviar: ");
                int numeroDestino = sc.nextInt();
                sc.nextLine();
                if (numeroDestino <= 0) {
                    System.out.println("Valor inválido. Digite um valor válido");
                    break;
                }
                System.out.print("Informe o numero da agencia que deseja enviar: ");
                int agenciaDestino = sc.nextInt();
                if (agenciaDestino <= 0) {
                    System.out.println("Valor inválido. Digite um valor válido");
                    break;
                }
                sc.nextLine();
                System.out.print("Informe o valor que deseja enviar: R$");
                tm.setValorEnvioTransacao(sc.nextDouble());
                sc.nextLine();

                double valor = tm.getValorEnvioTransacao();


                if (valor <= 0) {
                    System.out.println("Valor inválido. Digite um valor acima de R$ 0,00.");
                } else if (valor > conta.getSaldo()) {
                    System.out.println("Saldo insuficiente. Seu saldo atual é: R$ " + conta.getSaldo());
                } else {
                    double novoSaldo = conta.getSaldo() - valor;
                    conta.setSaldo(novoSaldo);

                    System.out.println("Transferindo R$ " + valor + "...");
                    System.out.println("Transferência realizada com sucesso!");
                    System.out.println("Saldo atual: R$ " + conta.getSaldo());
                    break;
                }


                System.out.println("==== Sistema Bancário ====");
                System.out.print("Deseja tentar novamente? (CONFIRMAR) | (RECUSAR): ");
                String cr = sc.nextLine().trim().toUpperCase();

                if (cr.equals("CONFIRMAR")) {
                    System.out.println("Continuando processo de transação...");
                } else if (cr.equals("RECUSAR")) {
                    System.out.println("Operação cancelada. Voltando...");
                    break;
                } else {
                    System.out.println("Escreva corretamente.");
                }

            } while (true);

        } catch (Exception e) {
            System.err.println("Erro: Não foi possível processar a transação.");
            sc.nextLine();
        }
    }


}



