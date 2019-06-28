package com.example.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@Document(collection = "users") //mongodb查看的是users表
public class Users  implements Serializable {
    @Id     //表示为主键  mongodb不会再自动生成临时主键
    private Integer id;
    private String name;
    private int age;

    public Users() {

    }

    public Users(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
