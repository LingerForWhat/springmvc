/**
 * Created by linzixuan on 15/12/3.
 */

import com.cosco.springmvc.pojo.User;

import com.cosco.springmvc.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.swing.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:conf/spring-mybatis.xml"})

public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);
    @Resource
    private UserService userService = null;



    @Test
    public void test1(){
        User user = new User();
        user=userService.getUserById(1);

        System.out.println(user.getRealname());
    }
}
