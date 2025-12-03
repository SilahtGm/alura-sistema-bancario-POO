package model;

public class ContaModel {

    // Variaveis principais da conta
    private String nome;
    private String tipoDeConta;
    private int numero;
    private int agencia;
    private double saldo;

    //Construtor
    public ContaModel (String nome, String tipoDeConta, int numero, int agencia, double saldo) {
        this.nome = nome;
        this.tipoDeConta = tipoDeConta;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    // Getters and Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
