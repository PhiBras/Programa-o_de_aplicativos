package Atividade_16_04_2026.Exercício_8;

public class Main {
    public static void main(String[] args) {

        Autenticacao usuario = new UsuarioComum();
        Autenticacao adm = new Administrador();

        System.out.println(usuario.login("user", "123"));
        System.out.println(adm.login("admin", "admin123"));
    }
}