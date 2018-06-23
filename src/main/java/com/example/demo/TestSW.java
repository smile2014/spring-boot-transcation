package com.example.demo;

import com.example.demo.service.TestDataUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by chengxm on 2017-11-14.
 * leaning spring
 */
@Service
public class TestSW {
    @Autowired
    TestDataUpdateService testDataUpdateService;

    public void test() throws Exception{
        for (int i=0;i<10;i++){
            try{
                testDataUpdateService.insertABC(i);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
