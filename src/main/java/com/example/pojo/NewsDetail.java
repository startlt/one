package com.example.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class NewsDetail implements Serializable{
    private long id;
    private String title;
    private String summary;
    private String author;
    private Date createdate;
}
