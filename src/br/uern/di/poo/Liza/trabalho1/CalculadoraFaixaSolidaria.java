package br.uern.di.poo.Liza.trabalho1;

public class CalculadoraFaixaSolidaria {

    public void calculoCustoDiario(Double kmTotais,
                                   Double precoLitro,
                                   Double kmPorLitro,
                                   Double taxaEstacionamento,
                                   Double pedagio) {
        Double custoDiario = (((kmTotais / kmPorLitro) * precoLitro) + taxaEstacionamento + pedagio);
        imprimirCustoDiario("O seu custo diário para dirigir ao trabalho é: R$" + custoDiario);
    }

    private void imprimirCustoDiario(String mensagem) {
        System.out.println(mensagem);
    }
}
