package smarttv.arthur.anatomiadeclasses;

public class SmartTv {
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 10;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}
