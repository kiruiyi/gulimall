package com.gulimall;

import com.gulimall.dao.AttrDao;
import com.gulimall.domin.Attr;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class test {
    @Autowired
     private AttrDao attrDao;


    @Test
    void selectAll() {
        List<Attr> attrs = attrDao.selectList(null);
        System.out.println(attrs);
    }
}
