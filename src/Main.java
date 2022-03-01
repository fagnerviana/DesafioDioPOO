import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){


        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso java POO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setName("Fagner");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" +dev1.getConteudoInscritos());
        dev1.progredir();
        System.out.println("Conteudos Inscritos" +dev1.getConteudoInscritos());
        System.out.println("Conteudo Conlcuido Fagner"+dev1.getConteudosConcluidos());
        System.out.println("XP "+ dev1.calcularTotalXp());

        System.out.println("*********************");
        System.out.println("*********************");


        Dev dev2 = new Dev();
        dev1.setName("Viana");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" +dev2.getConteudoInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Inscritos" +dev2.getConteudoInscritos());
        System.out.println("Conteudo Concluidos Viana"+dev2.getConteudosConcluidos());
        System.out.println("XP "+ dev2.calcularTotalXp());




    }


}
