package observe;

import java.nio.channels.Channel;

public class Main {
    public static void main(String[] args){
        Usuario usuario = new Usuario("Yasmin");

        String msg = "Oi, essa e nossa 1° notificação";

        Canal Canal = new Canal();

        Canal.addNewObserve(usuario);

        Canal.notificarObserve(msg);
    }

}
