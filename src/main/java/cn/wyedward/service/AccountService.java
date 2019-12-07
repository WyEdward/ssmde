package cn.wyedward.service;

import cn.wyedward.domain.Account;

import java.util.List;

public interface AccountService {

    /**
     * 查找账户
     * @return
     */
    List<Account> findAll();

    /**
     * 保存账户
     */
    void saveAccount(Account account);
}
