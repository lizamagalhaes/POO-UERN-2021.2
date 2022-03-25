package br.uern.di.poo.Liza.trabalho1;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.util.ArrayList;

public class Criptografia {

    public void encriptar(Integer numero) {
        String numeroParaString = numero.toString();
        if (!verificarQuantDeDigitos(numeroParaString)) {
            System.out.println("Este numero nao tem 4 digitos. ");
            return;
        }

        char[] sequenciaDeDigitos = numeroParaString.toCharArray();
        Integer digito1 = adicionaMaisSete(sequenciaDeDigitos, 0);
        Integer digito2 = adicionaMaisSete(sequenciaDeDigitos, 1);
        Integer digito3 = adicionaMaisSete(sequenciaDeDigitos, 2);
        Integer digito4 = adicionaMaisSete(sequenciaDeDigitos, 3);

        String digito1Mais7 = digito1.toString();
        String digito2Mais7 = digito2.toString();
        String digito3Mais7 = digito3.toString();
        String digito4Mais7 = digito4.toString();

        String digitosConcat = digito1Mais7.concat(digito2Mais7);
        String digitos2Concat = digitosConcat.concat(digito3Mais7);
        String digitos3Concat = digitos2Concat.concat(digito4Mais7);

        Integer resultadoParaInteiro = Integer.parseInt(digitos3Concat);
        Integer resultadoPorDez = resultadoParaInteiro / 10;
        char[] resultadoPorDezDigitos = resultadoPorDez.toString().toCharArray();
        final char aux = resultadoPorDezDigitos[2];
        resultadoPorDezDigitos[2] = resultadoPorDezDigitos[0];
        resultadoPorDezDigitos[0] = aux;

        final char aux2 = resultadoPorDezDigitos[3];
        resultadoPorDezDigitos[3] = resultadoPorDezDigitos[1];
        resultadoPorDezDigitos[1] = aux2;

        String result = String.valueOf(resultadoPorDezDigitos);
        System.out.println("O seu numero criptografado eh: " + result);

    }

    private boolean verificarQuantDeDigitos(String digitos) {
        return digitos.length() == 4;
    }

    private Integer adicionaMaisSete(char[] digitos, Integer indice) {
        String digitoToString = String.valueOf(digitos[indice]);
        return Integer.parseInt(digitoToString) + 7;
    }
}
