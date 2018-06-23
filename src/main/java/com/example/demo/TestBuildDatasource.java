package com.example.demo;

import com.bstek.ureport.definition.datasource.BuildinDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author chengxm
 * @date 2017-10-27
 * leaning spring
 */
@Component
public class TestBuildDatasource implements BuildinDatasource {
    @Autowired
    private DataSource dataSource;

    @Override
    public String name() {
        return "内置数据源Demo";
    }

    @Override
    public Connection getConnection() {
        try{
           return dataSource.getConnection();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

}
