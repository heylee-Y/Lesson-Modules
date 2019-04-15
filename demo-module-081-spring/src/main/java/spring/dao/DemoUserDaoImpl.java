package spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import spring.model.DemoUser;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DemoUserDaoImpl implements DemoUserDao {

    @Autowired
    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(DemoUser demoUser) {
        String sql = "insert into demo.demo_user values (?,?,?,?,now(),?)";
        Connection connection = null;

        try {
            connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, demoUser.getId());
            ps.setString(2, demoUser.getName());
            ps.setString(3, demoUser.getRole());
            ps.setString(4, demoUser.getPassword());
            ps.setString(5, demoUser.getComment());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public DemoUser findUserById(Long id) {
        String sql = "select * from demo.demo_user where id = ?";
        jdbcTemplate = new JdbcTemplate(dataSource);
//        DemoUser demoUser = (DemoUser) jdbcTemplate.queryForObject(sql, new Object[]{id}, new DemoUserRowMapper());
        DemoUser demoUser = (DemoUser) jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(DemoUser.class));
        return demoUser;
    }

    public List<DemoUser> findAllUsers() {

        String sql = "select * from demo.demo_user";
        jdbcTemplate = new JdbcTemplate(dataSource);
        List<DemoUser> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper(DemoUser.class));
        return list;
    }
}
