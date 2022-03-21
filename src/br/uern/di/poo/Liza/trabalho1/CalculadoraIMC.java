package br.uern.di.poo.Liza.trabalho1;

public class CalculadoraIMC {

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

}
