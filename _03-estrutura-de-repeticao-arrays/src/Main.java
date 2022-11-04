public class Main {
    public static void main(String[] args) {

        String arrayUsers [] = {"Arthur","Patricia","Suellen","Pietro"};

        for(int i=0; i < arrayUsers.length; i++){
            System.out.println("Aluno "+i+" "+arrayUsers[i]);
        }

        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }

        System.out.println(30 / 0);
    }
}