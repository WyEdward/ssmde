package cn.wyedward.dao;

import cn.wyedward.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {
    /**
     * 查找账户
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 保存账户
     */
    @Insert(value="insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);
}
