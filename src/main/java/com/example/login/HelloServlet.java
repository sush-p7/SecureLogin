package com.example.login;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
//    private String message;

//    public void init() {
//        message = "Hello World!";
//    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        try{
            String email = request.getParameter("Email");
            String password = request.getParameter("Password");

            Class.forName("com.mysql.jdbc.Driver");

            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/credentials","root","Sushantp@9");
            PreparedStatement insert =c.prepareStatement("insert into login values (?,?)");
            insert.setString(1,email);
            insert.setString(2,password);
            insert.executeUpdate();
            out.println("done");
        }catch (Exception e){
            out.println(e);
        }
    }

    public void destroy() {
    }
}