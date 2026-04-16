package Atividade_16_04_2026.Exercício_8;

class UsuarioComum implements Autenticacao {

    @Override
    public boolean login(String usuario, String senha) {
        return usuario == "user" && senha == "123";
    }
}