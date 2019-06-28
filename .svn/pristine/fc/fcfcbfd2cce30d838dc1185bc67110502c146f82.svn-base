package com.example.controller;

import com.example.pojo.NewsDetail;
import com.example.service.NewService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HelloController {
    public HelloController() {
        System.out.println("HelloController start");
    }

    @Autowired
    private NewService nService;


    @GetMapping("/hello")
    public String hello(Model model, HttpSession session){
        System.out.println("hello..");
        NewsDetail nd=new NewsDetail();
        nd.setId(3);
        nd.setTitle("标题3333");
        List<NewsDetail> allNews = nService.findAllNews();
        model.addAttribute("entity",nd);
        model.addAttribute("list",allNews);
        model.addAttribute("name","admin");
        model.addAttribute("count",50);
        model.addAttribute("total",100);
        session.setAttribute("nd",nd);
        return "hello";


    }
    @GetMapping("/find")
    public String findAll(Model model){
        System.out.println("find");
        Page<Object> pg = PageHelper.startPage(1, 2);
        nService.findAllNews();
        System.out.println("list:"+pg.getResult());
        model.addAttribute("list",pg.getResult());
        model.addAttribute("comments",nService.selectAll());
        return "news";

    }
}
