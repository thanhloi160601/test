
package com.example.demo3;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.nio.charset.StandardCharsets;


@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {message = "Nguyễn Thành Lợi";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        //out.println("<%@ page language=\'java\' contentType=\'text/jsp; charset=UTF-8\'\n' + ' pageEncoding=\'UTF-8\'%>");
      //  out.println("%@ page contentType=\'text/html; charset=UTF-8\' pageEncoding=\'UTF-8\'");
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}