package com.example.dao;

import com.example.pojo.NewsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewDetailMapper {

    public List<NewsDetail> findAllNews();

    public NewsDetail findNewsById(long id);

    public int deleteById(@Param("id") long id);
}
