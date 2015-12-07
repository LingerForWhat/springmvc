package serviceTest;

import com.cosco.springmvc.pojo.User;
import com.cosco.springmvc.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linzixuan on 15/12/4.
 */
public class UserServiceTest {


    private UserService userService;
    @Before
    public void before(){
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userService");
    }

    @Test
    public void Test() throws Exception{

        User user = userService.getUserByName("root");
        System.out.println(user.getPassword());
    }

}
