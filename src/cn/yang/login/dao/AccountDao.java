package cn.yang.login.dao;

import cn.itcast.jdbc.TxQueryRunner;
import cn.yang.login.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/10/26
 */
public class AccountDao {

    private QueryRunner queryRunner = new TxQueryRunner();

    public void addAcount(Account account) {
        String sql = "insert into account values(?,?);";
        Object[] params = {account.getName(), account.getPassword()};
        try {
            queryRunner.update(sql, params);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Account findAccount(String name) {
        String sql = "select * from account where name = '" + name + "';";
        try {
            Object[] params = {};
            Account account = queryRunner.query(sql, new BeanHandler<>(Account.class), params);
            return account;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
