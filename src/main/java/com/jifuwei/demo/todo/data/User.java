package com.jifuwei.demo.todo.data;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by JFW on 2017/4/28.
 */
@Data
public class User implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
