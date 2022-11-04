package pilares.poo;

public class Telegram extends Messenger{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MsnMessenger");
        salvarHistorico();
    }
}
