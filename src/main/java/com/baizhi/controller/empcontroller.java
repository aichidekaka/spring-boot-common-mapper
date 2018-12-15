package com.baizhi.controller;


import com.baizhi.entity.Emp;

import com.baizhi.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class empcontroller {
    @Autowired
    EmpMapper empMapper;

    @RequestMapping("/queryAll")
    public List<Emp> queryAll(HttpSession session) {
        List<Emp> list = empMapper.selectAll();
        empMapper.insert( );
        session.setAttribute("list", list);
        System.out.print(list);
        return list;
    }


}
