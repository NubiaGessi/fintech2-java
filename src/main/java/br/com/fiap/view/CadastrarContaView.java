package br.com.fiap.view;
import br.com.fiap.dao.AccountDao;
import br.com.fiap.model.Account;

import java.sql.SQLException;

//Metodo Cadastrar conta
public class CadastrarContaView {
    public static void main(String[] args) {
        try {
            AccountDao dao = new AccountDao();
            Account account = new Account ("0001", "00000001-0", 1L,"CONTA PRINCIPAL","CORRENTE",1000.0, 1L);
            dao.cadastrar(account);
            dao.fecharConexao();
            System.out.println("Conta Cadastrada!");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}