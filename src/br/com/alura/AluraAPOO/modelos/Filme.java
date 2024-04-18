package br.com.alura.AluraAPOO.modelos;

import br.com.alura.AluraAPOO.calculos.Classificavel;
import br.com.alura.AluraAPOO.calculos.FiltroRecomendacao;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }

    public Filme(String nome, int an){
        this.setNome(nome);
        this.setAnoDeLancamento(an);
    }

}
