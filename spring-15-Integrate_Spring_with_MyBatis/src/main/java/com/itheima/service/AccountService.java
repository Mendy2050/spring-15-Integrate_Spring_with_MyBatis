package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @author Mendy
 * @create 2023-06-21 19:19
 */
public interface AccountService {
    void save(Account account);

    void delete(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);

}
