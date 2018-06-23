package com.example.demo.repository;

import jdk.nashorn.internal.scripts.JD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chengxm on 2017-11-14.
 * leaning spring
 */
@Repository
public class AbcDao {
     public void test1(int i,JdbcTemplate jdbcTemplate) throws Exception{
        jdbcTemplate.update("INSERT INTO ABC(ID,NAME) VALUES(?,?)", new Object[]{i, "测试"+i});
        test2(i,jdbcTemplate);
    }
    private void test2(int i, JdbcTemplate jdbcTemplate) throws Exception{
        jdbcTemplate.update("INSERT INTO t_student(ID,NAME,SEX,description) VALUES(?,?,?,?)", new Object[]{i, "测试"+i,"MAN","ABC"});
    }
}
