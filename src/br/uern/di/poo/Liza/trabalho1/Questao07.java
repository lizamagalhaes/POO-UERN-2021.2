package br.uern.di.poo.Liza.trabalho1;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Questionario questionario = new Questionario();
        questionario.configurarQuestionario();

        for (int i = 0; i < 5; i++) {
            Questao questao = questionario.getListaDeQuestoes().get(i);
            System.out.println(questao.getEnunciado());
            for (int j = 0; j < 4; j++) {
                System.out.println(questao.getRespostas().get(j));
            }
            System.out.println("\nQual alternativa correta?");
            Scanner imput = new Scanner(System.in);
            String resposta = imput.nextLine();
            questionario.inicializarQuestionario(resposta, questao.getRespostaCorreta());
            System.out.println(questionario.getQuantQuestoesCorretas());
        }

        questionario.validacaoDesempenho();
    }
}
