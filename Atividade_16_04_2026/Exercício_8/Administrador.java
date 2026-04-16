package Atividade_16_04_2026.Exercício_8;

class Administrador implements Autenticacao {

    @Override
    public boolean login(String usuario, String senha) {
        return usuario == "admin" && senha == "admin123";
    }
}