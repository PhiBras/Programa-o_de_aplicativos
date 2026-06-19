package petshop;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection conectar() {

        Connection conn = null;

        try {

            String url = "jdbc:mysql://localhost:3306/petshop";
            String usuario = "root";
            String senha = "philippe21062003_Pr";

            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
