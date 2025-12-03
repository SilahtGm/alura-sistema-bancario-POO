package controller;

import model.ContaModel;
import model.InvestimentoModel;

import java.util.Scanner;

public class InvestimentoController {

    // Variaveis
    private ContaModel conta;

    //  Construtores
    public InvestimentoController () {
    }

    public InvestimentoController(ContaModel conta) {
        this.conta = conta;
    }

    // Instancias
    InvestimentoModel im = new InvestimentoModel();
    Scanner sc = new Scanner(System.in);

    // Menu Investimento
    public void menuInvestimento () {
        try {
            while (true) {
                System.out.println("==== Menu Investimento ====");
                System.out.println("Operações:");
                System.out.println("1 - Investir");
                System.out.println("2 - Consultar Investimento");
                System.out.println("3 - Sair");
                System.out.print("Digite a opção desejada: ");
                int op = sc.nextInt();
                sc.nextLine();

                switch (op) {
                    case 1: {
                        efetuarInvestimento();
                        break;
                    }
                    case 2: {
                        exibirInvestimento();
                        break;
                    }
                    case 3: {
                        System.out.println("Saindo do Menu Investimento...");
                        return;
                    }

                }
            }
        } catch (Exception e) {
            System.err.println("Erro, o sistema não processou bem essa requisição");
        }
    }

    // Metodos
    public void efetuarInvestimento () {
        try {
            do {
                System.out.println("==== Sistema Bancário ====");
                System.out.println("Digite um valor para investir: R$");
                double valor = sc.nextDouble();
                sc.nextLine();
                if (valor <= conta.getSaldo()) {
                    if (valor <= 0 || valor > 1000000) {
                        System.out.println("Valor negativo ou ultrapassa o valor máximo para investimento (R$1.000.000)");
                    }
                    System.out.println("Tipo de investimento (CDB) | (LCI/LCA): ");
                    String tipo = sc.next().trim().toUpperCase() + sc.nextLine();
                    if (tipo.equals("CDB") || tipo.equals("LCI") || tipo.equals("LCA") ||
                            tipo.equals("LCI/LCA")) {
                        double novoSaldo = conta.getSaldo() - valor;
                        conta.setSaldo(novoSaldo);
                        im.setSaldoInvestimento(valor);
                        im.setTipoDeInvestimento(tipo);
                        System.out.println("Valor investido com sucesso! Valor investido: R$" + valor);
                        System.out.println("Saldo atual da conta: R$" + conta.getSaldo());
                        break;
                    } else {
                        System.out.println("Digite o tipo corretamente.");
                    }
                } else {
                    System.out.println("Valor não compatível com saldo");
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
        } catch(Exception e){
                System.err.println("Erro, o sistema não processou bem essa requisição");
                }
            }


    public void exibirInvestimento () {
        try {
        if (im.getTipoDeInvestimento() == null) {
            System.out.println("Nenhum investimento foi realizado.");
        } else {
            System.out.println("==== Sistema Bancário =====");
            System.out.println("--- DETALHES INVESTIMENTO ---");
            System.out.println("Valor Investido: " + im.getSaldoInvestimento());
            System.out.println("Tipo de Investimento: " + im.getTipoDeInvestimento());
            System.out.println("-------------------------");
        } } catch (Exception e) {
            System.err.println("Erro, o sistema não processou bem essa requisição");
        }

    }
}
