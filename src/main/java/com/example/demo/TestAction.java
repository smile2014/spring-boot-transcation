package com.example.demo;

import com.example.demo.service.TestDataUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chengxm on 2017-10-27.
 * leaning spring
 */
@RestController
@RequestMapping("/mvc")
public class TestAction {
    @Autowired
    TestSW testSW;

    @RequestMapping("/hello")
    public String testData() {
        String strReturn="";
        try {
            testSW.test();

//            try {
//                testDataUpdate.insertABC();
//            }catch (Exception e) {
//                e.printStackTrace();
//            }
//            testDataUpdate.insertABC1();
        } catch (Exception e) {
            e.printStackTrace();
            strReturn=e.getMessage();
            System.out.print(strReturn);
        }
        return strReturn;
    }
}
