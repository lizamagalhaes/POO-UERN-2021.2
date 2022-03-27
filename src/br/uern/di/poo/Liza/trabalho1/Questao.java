package br.uern.di.poo.Liza.trabalho1;

import java.util.ArrayList;

public class Questao {
    private String respostaCorreta;
    private String enunciado;
    private ArrayList<String> respostas;

    public Questao() {
    }

    public Questao(String respostaCorreta, String enunciado, ArrayList<String> respostas) {
        this.respostaCorreta = respostaCorreta;
        this.enunciado = enunciado;
        this.respostas = respostas;
    }

    public String getRespostaCorreta() {
        return respostaCorreta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public ArrayList<String> getRespostas() {
        return respostas;
    }
}


