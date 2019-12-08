package cn.wyedward.test;

import cn.wyedward.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        as.findAll();
    }
}
