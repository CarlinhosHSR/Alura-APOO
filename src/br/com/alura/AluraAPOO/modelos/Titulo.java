package br.com.alura.AluraAPOO.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo() {
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.alura.AluraAPOO.modelos.Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    public void exibeFichaTecnicaSerie(){
        System.out.println("\nNome do Serie: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() { return nome; }

    public int getAnoDeLancamento() { return anoDeLancamento; }

    public int getDuracaoEmMinutos() { return duracaoEmMinutos; }

    public void setNome(String nome) { this.nome = nome; }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){ this.incluidoNoPlano = incluidoNoPlano; }

    public void setAnoDeLancamento(int anoDeLancamento) { this.anoDeLancamento = anoDeLancamento; }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) { this.duracaoEmMinutos = duracaoEmMinutos; }

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }
}
