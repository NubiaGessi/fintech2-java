package br.com.fiap.view;

import br.com.fiap.dao.UsuarioDao;
import br.com.fiap.model.Usuario;
import java.sql.SQLException;
import java.util.List;

public class ListarUsuarioView {
    public static void main(String[] args) {
        try {
            UsuarioDao dao = new UsuarioDao();
            List<Usuario> usuarios = dao.listar();

            for (Usuario usuario : usuarios) {
                System.out.println(usuario.getId_usuario() + " " + usuario.getDs_nome_usuario() + ", " + usuario.getDs_email());
                System.out.println("CPF " + usuario.getNr_cpf_usuario() + ", " + usuario.getSt_status());
            }

            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}

