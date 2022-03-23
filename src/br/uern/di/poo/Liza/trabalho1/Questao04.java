package br.uern.di.poo.Liza.trabalho1;

import java.util.List;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        System.out.println("Digite seu nome: ");
        Scanner imput1 = new Scanner(System.in);
        String nome = imput1.nextLine();

        System.out.println("Digite seu sobrenome: ");
        Scanner imput2 = new Scanner(System.in);
        String sobrenome = imput2.nextLine();

        System.out.println("Digite seu sexo: ");
        Scanner imput3 = new Scanner(System.in);
        String sexo = imput3.nextLine();

        System.out.println("Digite o dia em que voce nasceu: ");
        Scanner imput4 = new Scanner(System.in);
        Integer diaNascimento = imput4.nextInt();

        System.out.println("Digite o mes em que voce nasceu: ");
        Scanner imput5 = new Scanner(System.in);
        Integer mesNascimento = imput5.nextInt();

        System.out.println("Digite o ano em que voce nasceu: ");
        Scanner imput6 = new Scanner(System.in);
        Integer anoNascimento = imput6.nextInt();

        System.out.println("Digite o ano atual: ");
        Scanner imput7 = new Scanner(System.in);
        Integer anoAtual = imput7.nextInt();

        System.out.println("Digite seu peso em kg: ");
        Scanner imput8 = new Scanner(System.in);
        Double peso = imput8.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        Scanner imput9 = new Scanner(System.in);
        Double altura = imput9.nextDouble();

        HealthProfile perfilSaude = new HealthProfile(nome,
                sobrenome,
                sexo,
                diaNascimento,
                mesNascimento,
                anoNascimento,
                altura,
                peso);

        Integer idade = perfilSaude.calcularIdadeEmAnos(anoAtual);
        Integer frequenciaCardiacaMaxima = perfilSaude.calcularFrequenciaCardiacaMaxima(anoAtual);
        List<Double> frequenciaCardiacaAlvo = perfilSaude.calcularFrequenciaCardiacaAlvo(anoAtual);
        perfilSaude.exibirInformacoesDoUsuario(idade, frequenciaCardiacaMaxima, frequenciaCardiacaAlvo);
        Double resultadoIMC = perfilSaude.calculoIMC(peso, altura);
        perfilSaude.exibirInformacoesDoDepartamentoDeSaude(resultadoIMC);
    }
}
