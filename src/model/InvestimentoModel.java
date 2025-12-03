package model;

public class InvestimentoModel {

    // Variaveis
    private double saldoInvestimento;
    private String tipoDeInvestimento;

    public String getTipoDeInvestimento() {
        return tipoDeInvestimento;
    }

    public void setTipoDeInvestimento(String tipoDeInvestimento) {
        this.tipoDeInvestimento = tipoDeInvestimento;
    }

    // Getters and Setters
    public double getSaldoInvestimento() {
        return saldoInvestimento;
    }

    public void setSaldoInvestimento(double saldoInvestimento) {
        this.saldoInvestimento = saldoInvestimento;
    }
}
