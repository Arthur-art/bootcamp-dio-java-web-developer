package boletim.arthur.anatomiadeclasses;

public class BoletimEstudantil {

    public static String notaAluno(int nota){

        if(nota < 6){
            return "REPROVADO";
        }else if(nota == 6){
            return "PROVA MINERVA";
        }else if(nota > 6){
            return "APROVADO";
        }else{
            return "APROVADO";
        }
    }
}
