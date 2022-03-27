package br.uern.di.poo.Liza.trabalho1;

public class Questao06 {
    public static void main(String[] args) {
        CalculadoraPopulacao calculadoraPopulacao = new CalculadoraPopulacao();
        calculadoraPopulacao.CalculaPopulacaoMundial();
        System.out.println("ESTIMATIVA DE CRESCIMENTO POPULACIONAL PELOS PROXIMOS 75 ANOS:");
        for (int i = 0; i < calculadoraPopulacao.getListaDemonstrativoPopulacional().size(); i++) {
            System.out.println(calculadoraPopulacao.getListaDemonstrativoPopulacional().get(i));
        }
    }
}
