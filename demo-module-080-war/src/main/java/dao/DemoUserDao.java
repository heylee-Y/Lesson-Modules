package dao;

import model.DemoUser;
import org.apache.ibatis.session.SqlSession;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DemoUserDao extends BaseDao {

    public static final String NAMESPACE = "model.DemoUser";

    public List<DemoUser> getUsers() {
        getConnection();
        List<DemoUser> list = new ArrayList<DemoUser>();
        try {
            String sql = "select * from demo.demo_user";
            ps = connection.prepareStatement(sql);

            result = ps.executeQuery();
            DemoUser demoUser = new DemoUser();

            while (result.next()) {
                demoUser.setId(result.getLong(1));
                demoUser.setName(result.getString(2));
                demoUser.setRole(result.getString(3));
                demoUser.setPassword(result.getString(4));
                demoUser.setUpdateTime(result.getTimestamp(5));
                demoUser.setComment(result.getString(5));
                list.add(demoUser);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(connection, ps, result);
        }
        return list;
    }

    public List<DemoUser> getAllUsers() {
        SqlSession sqlSession = MyBatisUtil.getSession();
        List<DemoUser> list = sqlSession.selectList(NAMESPACE + ".queryAll");
        return list;
    }
}
