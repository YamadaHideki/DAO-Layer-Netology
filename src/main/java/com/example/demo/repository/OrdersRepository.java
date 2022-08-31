package com.example.demo.repository;

import com.example.demo.MyFileReader;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrdersRepository {

    private final JdbcTemplate jdbcTemplate;
    private final String sqlQuery;

    public OrdersRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.sqlQuery = MyFileReader.read("get_product_name_by_customer_name_from_orders.sql");
    }

    public List<String> getProductName(String customerName) {
        return jdbcTemplate.query(
                sqlQuery,
                ps -> ps.setString(1, customerName),
                (rs, rowNum) -> rs.getString("product_name"));
    }
}
