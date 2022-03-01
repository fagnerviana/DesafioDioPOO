package br.com.dio.desafio.dominio;


public abstract class Conteudo {

    protected static final double XP_PADRAO=10d;

    //Atributos da classe
    private String titulo;
    private String descricao;

    //metodo
    public abstract double calcularXp();


    //Get and Settings
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
