package dao;

import com.cst.dao.StudentDao;
import com.cst.model.Student;
import config.PersistanceConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PersistanceConfiguration.class)
public class StudentDaoTest {

    @Autowired
    StudentDao studentDao;


    @Test
    public void testFindEmployee() {
        studentDao.get(Student.class, 1);
        Assert.assertNotNull(   studentDao.get(Student.class, 1));
    }
}
