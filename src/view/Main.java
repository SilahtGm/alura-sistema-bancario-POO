package view;

import controller.ContaController;
import controller.InvestimentoController;
import controller.TransacaoController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instancias
        Scanner sc = new Scanner(System.in);
        ContaController cc = new ContaController();
        TransacaoController tc = null;
        InvestimentoController ic = new InvestimentoController();

        // Menu Principal
        while (true) {
            System.out.println("==== Sistema Bancário ====");
            System.out.println("Operações:");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Consultar Conta");
            System.out.println("3 - Transações");
            System.out.println("4 - Investimento");
            System.out.println("5 - Sair ");
            System.out.print("Digite a opção desejada: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    if (cc.getConta() == null) {
                        cc.criarConta();
                        tc = new TransacaoController(cc.getConta());
                        ic = new InvestimentoController(cc.getConta());

                    } else {
                        System.out.println("Você já tem conta criada.");
                    }
                    break;

                case 2:
                    if (cc.getConta() != null) {
                        cc.imprimirDetalhesDaConta();
                    } else {
                        System.out.println("Crie uma conta primeiro.");
                    }
                    break;

                case 3:
                    if (cc.getConta() != null) {
                        if (tc != null) {
                       tc.menuTransacao();}
                    } else {
                        System.out.println("Crie uma conta primeiro.");
                    }
                    break;


                case 4:
                    if (cc.getConta() != null) {
                    ic.menuInvestimento();
                } else {
                    System.out.println("Crie uma conta primeiro.");
                }
                    break;



                case 5: do {
                    System.out.println("Tem certeza que deseja sair? (S/N): ");
                    String dc = sc.nextLine().trim().toUpperCase();
                    if (dc.equals("S")) {
                        System.out.println("Saindo...");
                        return;
                    } else if (dc.equals("N")) {
                        System.out.println("Operação cancelada. Voltando...");
                        break;
                    } else {
                        System.out.println("Digito inválido. Escreva corretamente");
                    } } while (true);
                break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}