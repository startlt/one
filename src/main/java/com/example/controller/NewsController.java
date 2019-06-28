package com.example.controller;

import com.example.pojo.NewsDetail;
import com.example.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NewsController {
    @Autowired
    private NewService nService;

    @RequestMapping(path="index.action",method= RequestMethod.GET)
    public String index() {
        System.out.println("index...");
        return "redirect:socket.html";
    }

    /**
     * 根据时间降序查询所有新闻
     * @return
     */
    @RequestMapping(value="/findNews",method=RequestMethod.POST)
    @ResponseBody
    public List<NewsDetail> findNews() {
        System.out.println("findNews:");
        List<NewsDetail> list = nService.findAllNews();
        return list;
    }
}
