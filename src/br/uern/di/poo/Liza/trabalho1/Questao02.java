package br.uern.di.poo.Liza.trabalho1;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        CalculadoraFaixaSolidaria calculadoraCusto = new CalculadoraFaixaSolidaria();

        System.out.println("Digite quantos quilômetros você dirige por dia: ");
        Scanner imput1 = new Scanner(System.in);
        Double kmTotais = imput1.nextDouble();

        System.out.println("Digite o preço por litro de gasolina: ");
        Scanner imput2 = new Scanner(System.in);
        Double precoLitro = imput2.nextDouble();

        System.out.println("Digite a sua média de quilômetros por litro: ");
        Scanner imput3 = new Scanner(System.in);
        Double kmPorLitro = imput3.nextDouble();

        System.out.println("Digite o valor que você paga por dia de taxas de estacionamento: ");
        Scanner imput4 = new Scanner(System.in);
        Double taxaEstacionamento = imput4.nextDouble();

        System.out.println("Digite o valor que você paga por dia de Pedágio: ");
        Scanner imput5 = new Scanner(System.in);
        Double pedagio = imput5.nextDouble();

        calculadoraCusto.calculoCustoDiario(kmTotais, precoLitro, kmPorLitro, taxaEstacionamento, pedagio);
    }
}
