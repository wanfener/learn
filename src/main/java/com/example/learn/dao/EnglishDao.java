package com.example.learn.dao;

import com.example.learn.entity.English;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;



public interface EnglishDao extends Repository<English, Integer> {

    English findById(int id);
    English findByName(String name);
}
