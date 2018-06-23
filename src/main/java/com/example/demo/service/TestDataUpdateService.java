package com.example.demo.service;

import com.example.demo.repository.AbcDao;
import jdk.nashorn.internal.scripts.JD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chengxm on 2017-10-27.
 * leaning spring
 */
@Service
public class TestDataUpdateService {

    @Autowired
    AbcDao abcDao;
    @Autowired
    JdbcTemplate jdbcTemplate;
   // @Transactional
    public void insertABC(int i) throws Exception {
        //jdbcTemplate.update("INSERT INTO ABC(ID,NAME) VALUES(?,?)", new Object[]{i, "测试"+i});
        abcDao.test1(i,jdbcTemplate);
    }

    public void test() throws Exception{
        for (int i=0;i<10;i++){
           try{
               insertABC(i);
           }catch (Exception e){
             System.out.println(e.getMessage());
           }
        }
     }

}