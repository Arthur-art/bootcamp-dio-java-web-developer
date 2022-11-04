package pilares.poo;

public abstract class Messenger {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validando sinal E");
    }

    protected void salvarHistorico(){
        System.out.println("Salvando historico de mensagem");
    }
}
