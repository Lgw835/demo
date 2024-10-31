package com.example.demo;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HelloServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String keyword = request.getParameter("keyword");

        String result;
        if ("java".equalsIgnoreCase(keyword)) {
            result = "查询结果：Java是一种广泛使用的编程语言。";
        } else if ("python".equalsIgnoreCase(keyword)) {
            result = "查询结果：Python是一种易于学习的编程语言。";
        } else {
            result = "1111";
        }

        response.getWriter().write(result);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}