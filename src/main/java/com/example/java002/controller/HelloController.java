package com.example.java002.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class HelloController
{
    @RequestMapping("/hello")
    @ResponseBody
    public void hello(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException
    {
//        List<String> ls = new  ArrayList<>();
//        ls.add("abc");
        String resultString = "{\n" +
                "\t\"data\":{\n" +
                "\t\t\"name\":\"lwenjim\"\n" +
                "\t}\n" +
                "}";
        response.setContentType("application/json");
        response.getWriter().write(resultString);
    }
}
