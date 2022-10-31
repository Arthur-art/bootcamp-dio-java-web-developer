import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java developer");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(72);

        Curso curso2 = new Curso();
        curso1.setTitulo("JavaScript developer");
        curso1.setDescricao("Descricao curso javascript");
        curso1.setCargaHoraria(82);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setDate(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria1.setTitulo("Mentoria JavaScript");
        mentoria1.setDescricao("Descricao mentoria javascript");
        mentoria1.setDate(LocalDate.now());

        System.out.println(curso1);
    }
}