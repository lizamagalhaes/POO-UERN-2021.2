package br.uern.di.poo.Liza.trabalho1;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Criptografia criptografia = new Criptografia();
        System.out.println("Digite um numero com 4 digitos: ");
        Scanner input = new Scanner(System.in);
        Integer digitos = input.nextInt();
        char[] digitosEncriptados = criptografia.encriptar(digitos);
        String digitosEncriptadosEmString = String.valueOf(digitosEncriptados);
        System.out.println("Digitos encriptados: " + digitosEncriptadosEmString);
        String digitosDecriptados = criptografia.decriptar(digitosEncriptados);
        System.out.println(digitosDecriptados);
    }
}
