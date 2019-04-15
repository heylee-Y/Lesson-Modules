package spring.dao;

import org.springframework.jdbc.core.RowMapper;
import spring.model.DemoUser;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoUserRowMapper implements RowMapper {
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        DemoUser demoUser = new DemoUser();
        demoUser.setId(resultSet.getLong("id"));
        demoUser.setName(resultSet.getString("name"));
        demoUser.setRole(resultSet.getString("role"));
        demoUser.setPassword(resultSet.getString("password"));
        demoUser.setUpdateTime(resultSet.getTimestamp("update_time"));
        demoUser.setComment(resultSet.getString("comment"));
        return demoUser;
    }
}
