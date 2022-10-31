import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dev arthur = new Dev();
        arthur.setNome("Arthur");

        Curso javaCurso = new Curso();
        javaCurso.setTitulo("Java developer");
        javaCurso.setDescricao("Descricao curso java");
        javaCurso.setCargaHoraria(72);

        Curso javaScriptCurso = new Curso();
        javaScriptCurso.setTitulo("JavaScript developer");
        javaScriptCurso.setDescricao("Descricao curso javascript");
        javaScriptCurso.setCargaHoraria(82);

        Mentoria mentoriaJs = new Mentoria();
        mentoriaJs.setTitulo("Mentoria JavaScript");
        mentoriaJs.setDescricao("Descricao mentoria javascript");
        mentoriaJs.setDate(LocalDate.now());

        Bootcamp bootcampFullStack = new Bootcamp();
        bootcampFullStack.setNome("Bootcamp FullStack Developer");
        bootcampFullStack.setDescricao("Descricao bootcamp java developer");
        bootcampFullStack.getConteudos().add(javaCurso);
        bootcampFullStack.getConteudos().add(mentoriaJs);
        bootcampFullStack.getDevsInscritos().add(arthur);

        arthur.inscreverBootcamp(bootcampFullStack);
        arthur.progredir();

        System.out.println(arthur.getConteudosConcluidos());
        System.out.println(arthur.calcularTotalXp());
    }
}