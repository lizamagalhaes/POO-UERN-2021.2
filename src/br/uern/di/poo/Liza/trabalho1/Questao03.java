package br.uern.di.poo.Liza.trabalho1;

import java.util.List;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        System.out.println("Digite seu nome: ");
        Scanner imput1 = new Scanner(System.in);
        String nome = imput1.nextLine();

        System.out.println("Digite seu sobrenome: ");
        Scanner imput2 = new Scanner(System.in);
        String sobrenome = imput2.nextLine();

        System.out.println("Digite o dia em que voce nasceu: ");
        Scanner imput3 = new Scanner(System.in);
        Integer diaNascimento = imput3.nextInt();

        System.out.println("Digite o mes em que voce nasceu: ");
        Scanner imput4 = new Scanner(System.in);
        Integer mesNascimento = imput4.nextInt();

        System.out.println("Digite o ano em que voce nasceu: ");
        Scanner imput5 = new Scanner(System.in);
        Integer anoNascimento = imput5.nextInt();

        System.out.println("Digite o ano atual: ");
        Scanner imput6 = new Scanner(System.in);
        Integer anoAtual = imput6.nextInt();

        HeartRates frequenciaCardiaca = new HeartRates(nome, sobrenome, diaNascimento, mesNascimento, anoNascimento);

        Integer idade = frequenciaCardiaca.calcularIdadeEmAnos(anoAtual);
        Integer frequenciaCardiacaMaxima = frequenciaCardiaca.calcularFrequenciaCardiacaMaxima(anoAtual);
        List<Double> frequenciaCardiacaAlvo = frequenciaCardiaca.calcularFrequenciaCardiacaAlvo(anoAtual);

        frequenciaCardiaca.exibirInformacoesDoUsuario(idade, frequenciaCardiacaMaxima, frequenciaCardiacaAlvo);
    }
}
