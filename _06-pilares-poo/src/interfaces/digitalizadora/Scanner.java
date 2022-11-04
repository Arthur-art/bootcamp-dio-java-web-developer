package interfaces.digitalizadora;

public class Scanner implements Digitalizadora{
    @Override
    public void digitalizar() {
        System.out.println("Digitalizando");
    }
}
