package br.uern.di.poo.Liza.trabalho1;

public class DemonstrativoPopulacional {

    private Integer ano;
    private Double populacaoOriginal;
    private Double populacaoEsperada;
    private Double aumentoPopulacao;

    public DemonstrativoPopulacional() {
    }

    public DemonstrativoPopulacional(Integer ano, Double populacaoOriginal, Double populacaoEsperada, Double aumentoPopulacao) {
        this.ano = ano;
        this.populacaoOriginal = populacaoOriginal;
        this.populacaoEsperada = populacaoEsperada;
        this.aumentoPopulacao = aumentoPopulacao;
    }

    public Integer getAno() {
        return ano;
    }

    public Double getPopulacaoOriginal() {
        return populacaoOriginal;
    }

    public Double getPopulacaoEsperada() {
        return populacaoEsperada;
    }

    public Double getAumentoPopulacao() {
        return aumentoPopulacao;
    }

    @Override
    public String toString() {
        return "Ano = " + ano +
                "| População esperada = " + populacaoEsperada +
                "| Aumento populacional no ano = " + aumentoPopulacao;
    }
}
