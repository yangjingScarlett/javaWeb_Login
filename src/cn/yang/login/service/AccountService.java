package cn.yang.login.service;

import cn.yang.login.dao.AccountDao;
import cn.yang.login.domain.Account;

/**
 * 上海万达小额贷款有限公司
 * Created by 杨静 on 2017/10/26
 */
public class AccountService {

    private AccountDao accountDao = new AccountDao();

    public void addAccount(Account account) {
        accountDao.addAcount(account);
    }

    public Account findAccount(String name) {
        return accountDao.findAccount(name);
    }
}
