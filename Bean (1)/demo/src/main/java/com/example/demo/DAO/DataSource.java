package com.example.demo.DAO;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Objects;

public class DataSource {
    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource ds;
    private static DataSource dataSource;

    static {
        config.setJdbcUrl("jdbc:mysql://localhost:3306;Person");
        config.setUsername("root");
        config.setPassword("Nguyen12102002@");
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setAutoCommit(false);
        config.setIdleTimeout(30000);
        config.setMaxLifetime(1800000);
        ds = new HikariDataSource(config);
    }

    private DataSource() {
    }

    public Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

    public static DataSource getInstance() {
        if (Objects.isNull(dataSource)) {
            dataSource = new DataSource();
        }
        return dataSource;
    }
}
