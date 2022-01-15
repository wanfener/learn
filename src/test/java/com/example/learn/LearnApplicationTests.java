package com.example.learn;

import com.example.learn.dao.EnglishDao;
import com.example.learn.entity.English;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnApplicationTests {

    @Autowired
    private EnglishDao englishDao;

    @Test
    void contextLoads() {
        English demo = englishDao.findById(1);
        System.out.println(demo);
    }

}
