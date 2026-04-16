package Atividade_16_04_2026.Exercício_5;

public class SMS implements Notificacao {

    public void enviarMensagem(String msg){
        System.out.println("SMS enviado: " + msg);
    }
}