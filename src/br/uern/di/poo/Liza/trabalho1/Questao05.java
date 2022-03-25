package br.uern.di.poo.Liza.trabalho1;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Criptografia criptografia = new Criptografia();
        System.out.println("Digite um numero com 4 digitos: ");
        Scanner input = new Scanner(System.in);
        Integer digitos = input.nextInt();
        criptografia.encriptar(digitos);
    }
}
