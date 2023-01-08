import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso iniciante java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Curso iniciante javascript");
        curso2.setCargaHoraria(9);

        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Mentoria java iniciante");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Conteudo conteudo = new Curso();

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel Machadi");
        devGabriel.inscreverBootcamp(bootcamp);
        devGabriel.progredir();

        System.out.println("Conteudos inscritos " + devGabriel.getConteudoInscritos());
        System.out.println("Conteudos Concluidos " + devGabriel.getConteudosConcluidos());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();

        System.out.println("Conteudos Inscritos " + devCamila.getConteudoInscritos());
        System.out.println("Conteudos Concluidos " + devCamila.getConteudosConcluidos());


    }
}