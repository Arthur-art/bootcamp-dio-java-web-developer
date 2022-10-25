package pilares.poo;

public class MsnMessenger extends Messenger {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MsnMessenger");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MsnMessenger");
        salvarHistorico();
    }
}
