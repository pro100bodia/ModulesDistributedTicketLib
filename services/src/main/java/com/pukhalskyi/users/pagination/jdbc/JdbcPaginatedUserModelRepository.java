package com.pukhalskyi.users.pagination.jdbc;

import com.pukhalskyi.model.UserModel;
import com.pukhalskyi.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcPaginatedUserModelRepository implements UserRepository {
    private JdbcTemplate jdbcTemplate;
    private long page, size;

    @Autowired
    public JdbcPaginatedUserModelRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.page = 0;
        this.size = 3;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public Page<UserModel> findAll() {
        long limit = size;
        long offset = page * size;

        return new PageImpl<>(jdbcTemplate.query(String.format("SELECT * FROM user LIMIT %d OFFSET %d", limit, offset),
                this::mapRowToUser));
    }

    private UserModel mapRowToUser(ResultSet rs, int rowNum) throws SQLException {
        return new UserModel(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email")
        );
    }

}
