package br.com.alura.AluraAPOO.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativo;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String toString(){
        return "Serie: "+ getNome() + " (" + getAnoDeLancamento() + ")";
    }

    public int getTemporadas() {return temporadas;}

    public void setTemporadas(int temporadas) {this.temporadas = temporadas;}

    public int getEpisodiosPorTemporada() {return episodiosPorTemporada;}

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {this.episodiosPorTemporada = episodiosPorTemporada;}

    public boolean isAtivo() {return ativo;}

    public void setAtivo(boolean ativo) {this.ativo = ativo;}

    public int getMinutosPorEpisodio() {return minutosPorEpisodio;}

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {this.minutosPorEpisodio = minutosPorEpisodio;}

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
