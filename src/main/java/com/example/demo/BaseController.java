package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("v1/api")
public class BaseController {
    private final JdbcTemplate jdbcTemplate;

    public BaseController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @GetMapping("/test")
    @ResponseBody
    public String test(){

        String sql = "CREATE TABLE ROLE (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "title VARCHAR(255) NOT NULL" +
                ")";

        jdbcTemplate.execute(sql);

        return "Tạo bảng thành công";
    }
}
