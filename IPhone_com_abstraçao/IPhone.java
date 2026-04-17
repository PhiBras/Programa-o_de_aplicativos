package IPhone_com_abstraçao;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    // Musica
    @Override
    public void tocar(){
        System.out.println("Tocando música");
    }

    @Override
    public void pausar(){
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando música: " + musica);
    }

    // Telefone
    @Override
    public void ligar(String numero){
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender(){
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url){
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Nova aba aberta");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }
}