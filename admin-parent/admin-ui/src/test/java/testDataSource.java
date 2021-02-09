import com.dhw.dao.AdminMapper;
import com.dhw.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class testDataSource {

    @Autowired
    DataSource dataSource;

    @Autowired
    AdminMapper adminMapper;

    @Test
    public void testConnection() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    public void testSelectById(){
        Admin admin = adminMapper.selectByPrimaryKey(1);
        System.out.println(admin);
    }

    @Test
    public void test03(){
        //获取Logger对象，这里传入的Class就是当前打印日志的类
        Logger logger = LoggerFactory.getLogger(testDataSource.class);
        //等级 DEBUG < INFO < WARN < ERROR
        logger.debug("I am DEBUG!!!");

        logger.info("I am INFO!!!");

        logger.warn("I am WARN!!!");

        logger.error("I am ERROR!!!");

    }

}
