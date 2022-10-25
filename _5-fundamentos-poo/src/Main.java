import poo.arthur.introducao.ColorEnum;
import poo.arthur.introducao.EstadoBrasileiroEnum;
import poo.arthur.introducao.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println(EstadoBrasileiroEnum.MARANHAO.getSigla());

        System.out.println(EstadoBrasileiroEnum.RIO_JANEIRO.getNome());

        Student newStudent = new Student();

        newStudent.color = ColorEnum.BLACK.getColor();
        String name =  newStudent.setName("Arthur Teixeira");
        newStudent.age = 26;

        System.out.println(name);
    }
}