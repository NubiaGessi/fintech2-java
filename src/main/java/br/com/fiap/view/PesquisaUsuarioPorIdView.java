package br.com.fiap.view;
import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.exception.EntidadeNaoEncontradaException;
import br.com.fiap.model.Usuario;
import java.sql.SQLException;

public class PesquisaUsuarioPorIdView {
    public static void main(String[] args) {
        try {
            UsuarioDao dao = new UsuarioDao();
            Usuario usuario = dao.pesquisar(1);
            System.out.println(usuario.getId_usuario() + " " + usuario.getDs_nome_usuario() + ", " + usuario.getDs_email());
            System.out.println("CPF " + usuario.getNr_cpf_usuario() + ", " + usuario.getSt_status());
            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (EntidadeNaoEncontradaException e) {
            System.err.println("Usuário não existe na tabela");
        }
    }
}