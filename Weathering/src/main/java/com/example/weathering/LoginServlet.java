package com.example.weathering;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.sql.DriverManager;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        //Database info
//        String jdbcURL = "jdbc:postgresql://localhost:5432/Users";
//        String username = "postgres";
//        String password = "pervazninkai";

        //response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");


        //Create connection
//        Connection connection;
//        try {
//            connection = DriverManager.getConnection(jdbcURL, username, password);
//        } catch (SQLException ex) {
//            throw new RuntimeException(ex);
//        }
//        System.out.println("database connection successful");
//
//        //String sql = "SELECT * FROM USER WHERE USERNAME= '" + login + "' AND PASSWORD= '" + psw + "'";
//        String sql = "INSERT INTO user(username, password) VALUES (login, psw);";
//        Statement statement = null;
//        try {
//            statement = connection.createStatement();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        ResultSet rs = null;
//        try {
//            rs = statement.executeQuery(sql);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        //int rows = statement.executeQuery (sql);
//        try {
//            if (rs.next()) {
//                response.sendRedirect("Home.html");
//
//            } else {
//                out.println("Wrong username or password..");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }



        PrintWriter out = response.getWriter();
        String htmlResponse = "<html>";
        htmlResponse += "<h2>Your username is: " + username + "</h2>";
        htmlResponse += "<h2>Your password is: " + password + "</h2>";
        htmlResponse += "</html>";

        out.println(htmlResponse);

    }
}
