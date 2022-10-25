public abstract class Veiculo {

    private String placa;

    public void setPlaca(String numeroPlaca){
        this.placa = numeroPlaca;
    }

    public String getPlaca(){
        return placa;
    }

    public abstract void ligar();
}
