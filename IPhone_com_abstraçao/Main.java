package IPhone_com_abstraçao;

public class Main {
    public static void main(String[] args){

        IPhone iphone = new IPhone();

        //musica
        iphone.tocar();
        iphone.selecionarMusica("JVKE - golden hour");
        iphone.pausar();

        //telefone
        iphone.ligar("(71) 9 1234-5678");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        //internet
        iphone.exibirPagina("https://www.google.com/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
