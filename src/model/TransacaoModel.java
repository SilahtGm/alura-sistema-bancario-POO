package model;

public class TransacaoModel {

    // Variaveis principais
    private double valorEnvioTransacao;
    private double valorRecebidoTransacao;


    // Construtor
    public TransacaoModel() {
    }

    // Getters and Setters
    public double getValorEnvioTransacao() {
        return valorEnvioTransacao;
    }

    public void setValorEnvioTransacao(double valorEnvioTransacao) {
        this.valorEnvioTransacao = valorEnvioTransacao;
    }

    public double getValorRecebidoTransacao() {
        return valorRecebidoTransacao;
    }

    public void setValorRecebidoTransacao(double valorRecebidoTransacao) {
        this.valorRecebidoTransacao = valorRecebidoTransacao;
    }
}
