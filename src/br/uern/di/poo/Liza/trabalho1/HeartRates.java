package br.uern.di.poo.Liza.trabalho1;

import java.util.ArrayList;
import java.util.List;

public class HeartRates {

    private String nome;
    private String sobrenome;
    private Integer diaNascimento;
    private Integer mesNascimento;
    private Integer anoNascimento;

    public HeartRates() {
    }

    public HeartRates(String nome,
                      String sobrenome,
                      Integer diaNascimento,
                      Integer mesNascimento,
                      Integer anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(Integer diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public Integer getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(Integer mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public Integer getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(Integer anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Integer calcularIdadeEmAnos(Integer anoAtual) {
        Integer idade = anoAtual - anoNascimento;
        return idade;
    }

    public Integer calcularFrequenciaCardiacaMaxima(Integer anoAtual) {
        Integer frequenciaCardiaca = 220 - calcularIdadeEmAnos(anoAtual);
        return frequenciaCardiaca;
    }

    public List<Double> calcularFrequenciaCardiacaAlvo(Integer anoAtual) {
        ArrayList<Double> listaFrequenciaCardiacaAlvo = new ArrayList();
        Double frequenciaCardiacaAlvo1 = calcularFrequenciaCardiacaMaxima(anoAtual) * 0.5;
        Double frequenciaCardiacaAlvo2 = calcularFrequenciaCardiacaMaxima(anoAtual) * 0.85;
        listaFrequenciaCardiacaAlvo.add(frequenciaCardiacaAlvo1);
        listaFrequenciaCardiacaAlvo.add(frequenciaCardiacaAlvo2);
        return listaFrequenciaCardiacaAlvo;
    }

    public void exibirInformacoesDoUsuario(Integer idade, Integer frequenciaCardiacaMaxima, List<Double> listaFrequenciaCardiacaAlvo) {
        System.out.println("\n" +
                "Sua idade em anos eh: " + idade + ". \n" +
                "Sua frequencia cardiaca maxima eh: " + frequenciaCardiacaMaxima + ". \n" +
                "Sua frequencia cadiaca alvo fica entre " + listaFrequenciaCardiacaAlvo.get(0) + " e " + listaFrequenciaCardiacaAlvo.get(1) + ".");
    }

    @Override
    public String toString() {
        return "HeartRates{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", diaNascimento=" + diaNascimento +
                ", mesNascimento=" + mesNascimento +
                ", anoNascimento=" + anoNascimento +
                '}';
    }
}
