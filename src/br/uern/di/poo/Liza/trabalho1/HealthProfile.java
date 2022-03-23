package br.uern.di.poo.Liza.trabalho1;

import java.util.ArrayList;
import java.util.List;

public class HealthProfile {

    private String nome;
    private String sobrenome;
    private String sexo;
    private Integer diaNascimento;
    private Integer mesNascimento;
    private Integer anoNascimento;
    private Double altura;
    private Double peso;

    public HealthProfile() {
    }

    public HealthProfile(String nome,
                         String sobrenome,
                         String sexo,
                         Integer diaNascimento,
                         Integer mesNascimento,
                         Integer anoNascimento,
                         Double altura,
                         Double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
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

    public Double calculoIMC(Double peso, Double altura) {
        Double imc = peso / (altura * altura);
        return imc;
    }

    public void exibirInformacoesDoDepartamentoDeSaude(Double imc) {
        System.out.println("Seu IMC é: " + imc);

        System.out.println("\n" +
                "BMI VALUES \n" +
                "Underweigth: less than 18.5 \n" +
                "Normal: between 18.5 and 24.9 \n" +
                "Overweight: between 25 and 29.9 \n" +
                "Obese: 30 or greater");
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
