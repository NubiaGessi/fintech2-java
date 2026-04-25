package br.com.fiap.dao;

import br.com.fiap.exception.EntidadeNaoEncontradaException;
import br.com.fiap.factory.ConnectionFactory;
import br.com.fiap.model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AccountDao {
    private Connection conexao;

    public AccountDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void cadastrar(Account account) throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("INSERT INTO t_fintech_conta (nr_agencia, nr_conta, id_conta, ds_nome, ds_tipo, vl_saldo_atual, T_FINTECH_USUARIO_id_usuario) VALUES (?, ?, ?, ?, ?, ?, ?)");
        stm.setString(1, account.getNr_agencia());
        stm.setString(2, account.getNr_conta());
        stm.setLong(3, account.getId_conta());
        stm.setString(4, account.getDs_nome());
        stm.setString(5, account.getDs_tipo());
        stm.setDouble(6, account.getVl_saldo_atual());
        stm.setLong(7, account.getId_usuario());
        stm.executeUpdate();
    }

    public void fecharConexao() throws SQLException {
        conexao.close();
    }

    private Account parseAccount(ResultSet result) throws SQLException {
        String nr_agencia = result.getString("nr_agencia");
        String nr_conta = result.getString("nr_conta");
        Long id_conta = result.getLong("id_conta");
        String ds_nome = result.getString("ds_nome");
        String ds_tipo = result.getString("ds_tipo");
        Double vl_saldo_atual = result.getDouble("vl_saldo_atual");
        Long id_usuario = result.getLong("T_FINTECH_USUARIO_id_usuario");
        return new Account(nr_agencia, nr_conta, id_conta, ds_nome, ds_tipo, vl_saldo_atual,id_usuario);
    }

//    public Account pesquisar(long id_conta) throws SQLException, EntidadeNaoEncontradaException {
//        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM t_fintech_conta WHERE id_conta = ?");
//        stm.setLong(1, id_conta);
//        ResultSet result = stm.executeQuery();
//        if (!result.next())
//            throw new EntidadeNaoEncontradaException("Conta não encontrado");
//        return parseAccount(result);
//    }

    public List<Account> listar() throws SQLException {
        PreparedStatement stm = conexao.prepareStatement("SELECT * FROM t_fintech_conta");
        ResultSet result = stm.executeQuery();
        List<Account> lista = new ArrayList<>();
        while (result.next()) {
            lista.add(parseAccount(result));
        }
        return lista;
    }
}
