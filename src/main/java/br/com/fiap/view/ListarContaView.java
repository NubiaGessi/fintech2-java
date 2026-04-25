package br.com.fiap.view;
import br.com.fiap.dao.AccountDao;
import br.com.fiap.model.Account;

import java.sql.SQLException;
import java.util.List;

public class ListarContaView {
    public static void main(String[] args) {
        try {
            AccountDao dao = new AccountDao();
            List<Account> accounts = dao.listar();

            for (Account account : accounts) {
                System.out.println(account.getId_conta() + ", " + account.getNr_agencia()+ ", " + account.getNr_conta() + ", " + account.getVl_saldo_atual() + ", " + account.getDs_tipo() + ", " + account.getDs_nome());
                System.out.println("ID usuário " + account.getId_usuario());
            }

            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
