package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    //Apos extender a classe Conteudo, a mesma ja existe estes atirbutos
    /* private String titulo;
    private String descricao;*/
    private LocalDate data;

    public Mentoria(){

    }

    @Override
    public double calcularXp() {
        return XP_PADRAO+20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}
