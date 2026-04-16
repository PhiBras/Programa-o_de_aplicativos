package Atividade_16_04_2026.Exercício_5;

public class Main {
    public static void main(String[] args){
        Notificacao email = new Email();
        Notificacao sms = new SMS();

        email.enviarMensagem("Você tem um novo email");
        sms.enviarMensagem("Você tem um novo SMS");
    }
}
