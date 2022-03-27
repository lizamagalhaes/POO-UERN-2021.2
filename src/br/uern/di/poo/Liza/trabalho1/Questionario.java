package br.uern.di.poo.Liza.trabalho1;

import java.util.ArrayList;
import java.util.Locale;

public class Questionario {
    private final String enunciado1 = "\nQuestão 1 - O que é aquecimento global?";
    private ArrayList<String> respostasQuestao1 = new ArrayList();
    private final String enunciado2 = "\nQuestão 2 - Como o aquecimento global afeta os níveis dos oceanos?";
    private ArrayList<String> respostasQuestao2 = new ArrayList();
    private final String enunciado3 = "\nQuestão 3 - Qual das alternativas não é uma causa do aquecimento global?";
    private ArrayList<String> respostasQuestao3 = new ArrayList();
    private final String enunciado4 = "\nQuestão 4 - O que é o efeito estufa?";
    private ArrayList<String> respostasQuestao4 = new ArrayList();
    private final String enunciado5 = "\nQuestão 5 - Qual das alternativas não é uma solução para reduzir o aquecimento global?";
    private ArrayList<String> respostasQuestao5 = new ArrayList();
    private Integer quantQuestoesCorretas = 0;
    private ArrayList<Questao> listaDeQuestoes = new ArrayList();

    public void configurarQuestionario() {
        Questao questao1 = new Questao("A", enunciado1, respostasQuestao1);
        listaDeQuestoes.add(questao1);
        respostasQuestao1.clear();
        respostasQuestao1.add("A) É o aumento gradual da temperatura superficial global. ");
        respostasQuestao1.add("B) É o aumento do número de catástrofes climáticas. ");
        respostasQuestao1.add("C) É o aumento do calor causado pelos raios solares no planeta. ");
        respostasQuestao1.add("D) O aquecimento global não existe. ");

        Questao questao2 = new Questao("B", enunciado2, respostasQuestao2);
        listaDeQuestoes.add(questao2);
        respostasQuestao2.clear();
        respostasQuestao2.add("A) A água esquenta e evapora, formando nuvens e diminuindo o volume de águas nos oceanos. ");
        respostasQuestao2.add("B) O nível do mar aumenta, devido ao derretimento das geleiras. ");
        respostasQuestao2.add("C) O nível do mar aumenta, pois chove mais o normal. ");
        respostasQuestao2.add("D) Ele não afeta os níveis do oceanos, apenas a temperatura. ");

        Questao questao3 = new Questao("D", enunciado3, respostasQuestao3);
        listaDeQuestoes.add(questao3);
        respostasQuestao3.clear();
        respostasQuestao3.add("A) Desmatamento de florestas. ");
        respostasQuestao3.add("B) Emissão de gases-estufa. ");
        respostasQuestao3.add("C) Poluição dos rios. ");
        respostasQuestao3.add("D) Fazer a correta manutenção do seu veículo. ");

        Questao questao4 = new Questao("C", enunciado4, respostasQuestao4);
        listaDeQuestoes.add(questao4);
        respostasQuestao4.clear();
        respostasQuestao4.add("A) É uma consequência não natural do aquecimento global. ");
        respostasQuestao4.add("B) É o diminuição da temperatura nos trópicos. ");
        respostasQuestao4.add("C) É um fenômeno atmosférico natural que promove a manutenção do calor na Terra. ");
        respostasQuestao4.add("D) É o aumento da temperatura do planeta de forma descontrolada. ");

        Questao questao5 = new Questao("B", enunciado5, respostasQuestao5);
        listaDeQuestoes.add(questao5);
        respostasQuestao5.clear();
        respostasQuestao5.add("A) Usar ao máximo a iluminação natural dentro dos ambientes domésticos. ");
        respostasQuestao5.add("B) Usar apenas seu transporte para se locomover. ");
        respostasQuestao5.add("C) Uso de técnicas limpas e avançadas na agricultura para evitar a emissão de carbono. ");
        respostasQuestao5.add("D) Não praticar desmatamento e queimadas em florestas. ");
    }

    public void inicializarQuestionario(String respostaEscolhida, String respostaCorreta) {
        if (respostaEscolhida.toUpperCase(Locale.ROOT).equals(respostaCorreta)){
            System.out.println("Parabéns, você acertou a questão!");
            quantQuestoesCorretas++;
        } else {
            System.out.println("Resposta incorreta!");
        }
    }

    public Integer getQuantQuestoesCorretas() {
        return quantQuestoesCorretas;
    }

    public ArrayList<Questao> getListaDeQuestoes() {
        return listaDeQuestoes;
    }

    public void validacaoDesempenho() {
        if (quantQuestoesCorretas == 5) {
            System.out.println("Excelente!");
        } else if (quantQuestoesCorretas == 4) {
            System.out.println("Muito bom!");
        } else {
            System.out.println("É o momento de aprimorar seu conhecimento sobre o aquecimento global. \n" +
                    "Veja um pouco sobre o assunto nos sites abaixo: \n" +
                    "https://umsoplaneta.globo.com/clima/noticia/2021/04/04/bloco-1-o-que-e-o-aquecimento-global.ghtml \n" +
                    "https://www.todamateria.com.br/aquecimento-global/ \n" +
                    "https://mundoeducacao.uol.com.br/geografia/aquecimento-global.htm");
        }
    }
}
