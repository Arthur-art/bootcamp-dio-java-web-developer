package introducao.poo;

public class Carro extends Veiculo{

    String modelo;
    int ano;


    public Carro(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("cars.models.Carro ligado.");
    }

    private void confereCombustivel(){
        System.out.println("Conferindo combustivel.");
    }

    private void confereCambio(){
        System.out.println("Conferindo cambio em P.");
    }
}
