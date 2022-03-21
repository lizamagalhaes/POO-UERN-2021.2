package br.uern.di.poo.Liza.trabalho1;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        CalculadoraIMC calculadora = new CalculadoraIMC();
        System.out.println("Digite seu peso em kg: ");
        Scanner imput1 = new Scanner(System.in);
        Double peso = imput1.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        Scanner imput2 = new Scanner(System.in);
        Double altura = imput2.nextDouble();


        Double resultadoIMC = calculadora.calculoIMC(peso, altura);
        calculadora.exibirInformacoesDoDepartamentoDeSaude(resultadoIMC);
    }

}
