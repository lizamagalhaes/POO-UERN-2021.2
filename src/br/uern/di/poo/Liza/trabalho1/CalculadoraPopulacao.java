package br.uern.di.poo.Liza.trabalho1;

import java.util.ArrayList;

public class CalculadoraPopulacao {
    private Integer ano = 2022;
    private Double populacaoMundial = 7794798729.0;
    private Double taxaDeCrescimento = 1.01;
    private ArrayList<DemonstrativoPopulacional> listaDemonstrativoPopulacional = new ArrayList();

    public ArrayList<DemonstrativoPopulacional> getListaDemonstrativoPopulacional() {
        return listaDemonstrativoPopulacional;
    }

    public void CalculaPopulacaoMundial() {

        for ( int i = 0; i < 75; i++) {
            Double populacaoOriginal = this.populacaoMundial;
            populacaoMundial = populacaoMundial * taxaDeCrescimento;
            Double diferencaPopulacao = populacaoMundial - populacaoOriginal;
            DemonstrativoPopulacional demonstrativoPopulacional = new DemonstrativoPopulacional(ano, populacaoOriginal, populacaoMundial, diferencaPopulacao);
            listaDemonstrativoPopulacional.add(demonstrativoPopulacional);
            ano++;
        }
    }
    public Integer retornaAnoQuandoPopulacaoAtingeDobro(){
        Integer ano = 0;
        for (int i = 0; i < listaDemonstrativoPopulacional.size(); i++) {
            DemonstrativoPopulacional demonstrativoPopulacionalAtual = listaDemonstrativoPopulacional.get(i);
            Double valorPopulacional = demonstrativoPopulacionalAtual.getPopulacaoEsperada();
            Double valorPopulacaoOriginal = listaDemonstrativoPopulacional.get(0).getPopulacaoOriginal();
            Double valorPopulacionalEmDobro = valorPopulacaoOriginal * 2;
            if (valorPopulacional >= valorPopulacionalEmDobro){
                return demonstrativoPopulacionalAtual.getAno();
            }
        }
        return ano;
    }
}
