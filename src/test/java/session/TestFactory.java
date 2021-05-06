package session;

import com.mybatis.dao.PersonMapper;
import com.mybatis.entity.Person;
import com.mybatis.util.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

/**
 * @author lizhangyu
 * @date 2021/4/24 21:59
 */
public class TestFactory {

    @Test
    public void test() {
        SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        PersonMapper personDao = sqlSession.getMapper(PersonMapper.class);

        Person person = new Person();
        person.setAddress("深圳市");
        person.setAge(27);
        person.setEmail("1312312312@qq.com");
        person.setName("李四");
        person.setPhone("12312313123");
        personDao.insert(person);

//        System.out.println(person.toString());

        sqlSession.commit();
        sqlSession.close();
    }
}
