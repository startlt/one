package com.example.service;

import com.example.dao.NewDetailMapper;
import com.example.dao.NewsCommentMapper;
import com.example.pojo.NewsComment;
import com.example.pojo.NewsDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class NewServiceImpl implements NewService {

    @Autowired
    private NewDetailMapper ndm;
    @Autowired
    private  NewsCommentMapper ncm;

    @Override
    public List<NewsDetail> findAllNews() {
        return ndm.findAllNews();
    }

    @Override
    public int deleteNewsDetail(long id) {
        return  ncm.deleteByNewsId(id);
    }

    @Override
    public int saveNewsComment(NewsComment nc) {
        return ncm.insert(nc);
    }

    @Override
    public List<Map<String, Object>> selectAll() {
        return ncm.selectAll();
    }
}
