package introducao.poo;

public class Autodromo {

    public static void main(String[] args){

        Carro astonMartin = new Carro("Vantage", 2021);

        astonMartin.ligar();

        astonMartin.setPlaca("BH0-1230");

        Moto cb300 = new Moto();

        cb300.setPlaca("BHI-2312");

       cb300.ligar();
       astonMartin.ligar();

    }
}
