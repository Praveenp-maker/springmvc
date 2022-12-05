package com;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public int insertUser(User us){
        String qry="insert into user values('"+us.getId()+"','"+us.getName()+"','"+us.getAge()+"')";
        return jdbcTemplate.update(qry);
    }
    
}
