package br.com.alura.AluraAPOO.principal;

import br.com.alura.AluraAPOO.calculos.CalculadoraDeTempo;
import br.com.alura.AluraAPOO.calculos.FiltroRecomendacao;
import br.com.alura.AluraAPOO.modelos.Episodio;
import br.com.alura.AluraAPOO.modelos.Filme;
import br.com.alura.AluraAPOO.modelos.Serie;
import br.com.alura.AluraAPOO.modelos.Titulo;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1978);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDiretor("Carlinhos bala");

        Filme outroFilme = new Filme("Avatar", 2010);
        outroFilme.setDuracaoEmMinutos(150);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setDiretor("Só Deus sabe.");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(3);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie("Lost", 2005);
        minhaSerie.exibeFichaTecnicaSerie();
        minhaSerie.setTemporadas(6);
        minhaSerie.setEpisodiosPorTemporada(20);
        minhaSerie.setMinutosPorEpisodio(48);
        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.setAtivo(true);
        System.out.println("Duração para maratonar serie:  " + minhaSerie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        Filme filmeDoPaulo = new Filme("Dogville", 2000);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeDoPaulo);
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);

        System.out.println("Tamanho da Lista: " + listaDeFilme.size());
        System.out.println("Primeiro Filme: " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("toString do filme " + listaDeFilme.get(0).toString());


    }
}
