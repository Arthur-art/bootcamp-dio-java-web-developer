package interfaces;

import interfaces.copiadora.Copiadora;
import interfaces.digitalizadora.Digitalizadora;
import interfaces.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    @Override
    public void copiar() {
        System.out.println("Copiar");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizar");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimir");
    }
}
