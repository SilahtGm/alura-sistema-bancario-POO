package controller;

import model.ContaModel;
import model.TransacaoModel;

import java.util.Scanner;

public class ContaController {

    public ContaController() {
    }

    // Instancias para a criação de nossa classe
    private ContaModel conta;
    private Scanner sc = new Scanner(System.in);

    // Metodo para retornar a conta para o main
    public ContaModel getConta() {
        return conta;
    }

    // Metodo de criação de conta
    public ContaModel criarConta() {
        System.out.println("==== Sistema Bancário ====");

        System.out.println("Digite o seu nome: ");
        String nome = sc.next() + sc.nextLine();

        System.out.println("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite a agência: ");
       int numeroAgencia = sc.nextInt();
       sc.nextLine();

        while (true) {
            System.out.println("Digite o tipo da sua conta (Corrente) (Salario) (Poupança): ");
            String tipoConta = sc.nextLine().trim().toUpperCase();
            double saldo = 0;


            if (tipoConta.equals("CORRENTE") ||
                    tipoConta.equals("SALARIO") ||
                    tipoConta.equals("POUPANÇA")) {
                System.out.println("Criação de conta Bem-Sucedida.");
                conta = new ContaModel(nome, tipoConta, numeroConta, numeroAgencia, 0);
                break;

            } else {
                System.out.println("Inválido. Tente novamente.");
            }
        }

        return conta;
    }

    // Metodo para imprimir os detalhes da conta
    public void imprimirDetalhesDaConta() {
        System.out.println("==== Sistema Bancário =====");
        System.out.println("--- DETALHES DA CONTA ---");
        System.out.println("Cliente: " + conta.getNome());
        System.out.println("Conta Nº: " + conta.getNumero());
        System.out.println("Tipo: " + conta.getTipoDeConta());
        System.out.println("Saldo Atual: R$ " + conta.getSaldo());
        System.out.println("-------------------------");
    }

}


