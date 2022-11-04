import pilares.poo.Facebook;
import pilares.poo.Messenger;
import pilares.poo.MsnMessenger;
import pilares.poo.Telegram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Messenger smi = null;

        String appEscolhido = "facebook";

        if(appEscolhido.toLowerCase() == "msn"){
            smi = new MsnMessenger();
        } else if (appEscolhido.toLowerCase() == "facebook") {
            smi = new Facebook();
        } else if (appEscolhido.toLowerCase() == "telegram") {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
