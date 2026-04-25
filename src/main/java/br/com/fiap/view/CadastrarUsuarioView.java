package br.com.fiap.view;
import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.model.Usuario;
import java.sql.SQLException;

//Metodo Cadastrar usuário
public class CadastrarUsuarioView {
    public static void main(String[] args) {
        try {
            UsuarioDao dao = new UsuarioDao();
            Usuario usuario = new Usuario (3L, "usuariofintech3@email.com", "senhausuario3","23456789012","Usuario Fintech 3","ATIVO", "S");
            dao.cadastrar(usuario);
            dao.fecharConexao();
            System.out.println("Usuario Cadastrado!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

