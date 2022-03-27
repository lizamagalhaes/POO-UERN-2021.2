package br.uern.di.poo.Liza.trabalho1;

public class Criptografia {

    public char[] encriptar(Integer numero) {
        String numeroParaString = numero.toString();
        char[] digitosEncriptados = new char[0];
        if (verificarQuantDeDigitos(numeroParaString)) {
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
            resultadoPorDezDigitos = trocaPosicao(resultadoPorDezDigitos, 0, 2);
            resultadoPorDezDigitos = trocaPosicao(resultadoPorDezDigitos, 1, 3);
            digitosEncriptados = resultadoPorDezDigitos;
        }else {
            System.out.println("Este numero nao tem 4 digitos. ");
        }
        return digitosEncriptados;
    }

    public String decriptar(char[] digitos) {
        // trocar primeiro com terceiro
        digitos = trocaPosicao(digitos, 0, 2);
        // trocar segundo pelo quarto
        digitos = trocaPosicao(digitos, 1, 3);
        //multiplicar por 10
        Integer digitosInteiros = converteCharArrayParaInteger(digitos);
        Integer digitosMultiplicadoPorDez = digitosInteiros * 10;
        // subtrair por 7 e quando resultado der negativo juntar com o proximo e realizar nova subtracao
        char[] digitosSeparados = digitosMultiplicadoPorDez.toString().toCharArray();


        String digito1Menos7 = diminuiEmSete(digitosSeparados, 0).toString();
        String digito2Menos7 = diminuiEmSete(digitosSeparados, 1).toString();
        String digito3Menos7 = diminuiEmSete(digitosSeparados, 2).toString();
        String digito4Menos7 = diminuiEmSete(digitosSeparados, 3).toString();
        return digito1Menos7 + digito2Menos7 + digito3Menos7 + digito4Menos7;
    }

    private boolean verificarQuantDeDigitos(String digitos) {
        return digitos.length() == 4;
    }

    private Integer adicionaMaisSete(char[] digitos, Integer indice) {
        String digitoToString = String.valueOf(digitos[indice]);
        return Integer.parseInt(digitoToString) + 7;
    }

    private Integer diminuiEmSete(char[] digitos, Integer indice) {
        Integer digito = converteCharParaInteger(digitos[indice]);
        if (digito < 7) {
            String digitoIgualOuMaiorQueDez = String.valueOf(digitos[indice + 1]);
            String digitosConcatenado = digito + digitoIgualOuMaiorQueDez;
            digito = Integer.parseInt(digitosConcatenado) - 7;
        } else {
            digito = digito - 7;
        }
        return digito;
    }

    private char[] trocaPosicao(char[] digitos, Integer digitoInicial, Integer digitoFinal) {
        char digitoAuxiliar = digitos[digitoFinal];
        digitos[digitoFinal] = digitos[digitoInicial];
        digitos[digitoInicial] = digitoAuxiliar;
        return digitos;
    }

    private Integer converteCharArrayParaInteger(char[] digitos) {
        String charArrayParaString = String.valueOf(digitos);
        return Integer.parseInt(charArrayParaString);
    }

    private Integer converteCharParaInteger(char digito) {
        String digitoString = String.valueOf(digito);
        return Integer.parseInt(digitoString);
    }
}
