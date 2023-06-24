import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Mendy
 * @create 2023-06-21 19:12
 */
public class App {
    public static void main(String[] args) throws IOException {
        // 1. Create SqlSessionFactoryBuilder object
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 2. Load SqlMapConfig.xml configuration file
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 3. Create SqlSessionFactory object
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        // 4. Obtain SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 5. Execute SqlSession object to perform query, and get the result - User
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        Account ac = accountDao.findById(2);
        System.out.println(ac);

        // 6. Release resources
        sqlSession.close();
    }
}

