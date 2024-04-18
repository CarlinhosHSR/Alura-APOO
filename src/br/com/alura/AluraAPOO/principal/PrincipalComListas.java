package br.com.alura.AluraAPOO.principal;

import br.com.alura.AluraAPOO.modelos.Filme;
import br.com.alura.AluraAPOO.modelos.Serie;
import br.com.alura.AluraAPOO.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1978);
        meuFilme.avalia(8);
        Filme filmeDoPaulo = new Filme("Dogville", 2000);
        filmeDoPaulo.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2010);
        outroFilme.avalia(4);
        Serie minhaSerie = new Serie("Lost", 2005);
        minhaSerie.avalia(6);

        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(minhaSerie);
        for (Titulo item: lista){
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() >= 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }

        }

        
    }
}
