package br.com.fiap.dao;
import br.com.fiap.exception.EntidadeNaoEncontradaException;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Usuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {
    private Connection conexao;

    public UsuarioDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrar(Usuario usuario) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("INSERT INTO t_fintech_usuario (id_usuario, ds_email, pw_senha_hash, nr_cpf_usuario, ds_nome_usuario, st_status, ds_lgpd_consentimento) VALUES (?, ?, ?, ?, ?, ?, ?)");
        stm.setLong(1, usuario.getId_usuario());
        stm.setString(2, usuario.getDs_email());
        stm.setString(3, usuario.getPw_senha_hash());
        stm.setString(4, usuario.getNr_cpf_usuario());
        stm.setString(5, usuario.getDs_nome_usuario());
        stm.setString(6, usuario.getSt_status());
        stm.setString(7, usuario.getDs_lgpd_consentimento());
        stm.executeUpdate();
    }

    public void fecharConexao() throws SQLException {
        conexao.close();
    }

    private Usuario parseUsuario(ResultSet result) throws SQLException {
        Long id_usuario = result.getLong("id_usuario");
        String ds_email = result.getString("ds_email");
        String pw_senha_hash = result.getString("pw_senha_hash");
        String nr_cpf_usuario = result.getString("nr_cpf_usuario");
        String ds_nome_usuario = result.getString("ds_nome_usuario");
        String st_status = result.getString("st_status");
        String ds_lgpd_consentimento = result.getString("ds_lgpd_consentimento");
        return new Usuario(id_usuario, ds_email, pw_senha_hash, nr_cpf_usuario, ds_nome_usuario, st_status, ds_lgpd_consentimento);
    }

    public Usuario pesquisar(long id_usuario) throws SQLException, EntidadeNaoEncontradaException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM t_fintech_usuario WHERE id_usuario = ?");
        stm.setLong(1, id_usuario);
        ResultSet result = stm.executeQuery();
        if (!result.next())
            throw new EntidadeNaoEncontradaException("Produto não encontrado");
        return parseUsuario(result);
    }

    public List<Usuario> listar() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM t_fintech_usuario");
        ResultSet result = stm.executeQuery();
        List<Usuario> lista = new ArrayList<>();
        while (result.next()) {
            lista.add(parseUsuario(result));
        }
        return lista;
    }
}