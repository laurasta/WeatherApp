package com.example.weathering;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/choiceServlet")
public class ChoiceServlet extends HttpServlet {
    private String windSpeed_unit;
    private String latitude;
    private String longitude;
    private String startDate;
    private String endDate;
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.windSpeed_unit = request.getParameter("windSpeed_unit");
        this.latitude = request.getParameter("latitude");
        this.longitude = request.getParameter("longitude");
        this.startDate = request.getParameter("startDate");
        this.endDate = request.getParameter("endDate");

        PrintWriter writer = response.getWriter();
        String htmlResponse = "<html>";
        htmlResponse += "<h2>Your chosen wind speed unit is: " + windSpeed_unit + "</h2>";
        htmlResponse += "<h2>Your chosen latitude is: " + latitude + "</h2>";
        htmlResponse += "<h2>Your chosen longitude is: " + longitude + "</h2>";
        htmlResponse += "<h2>Your chosen start date is: " + startDate + "</h2>";
        htmlResponse += "<h2>Your chosen end date is: " + endDate + "</h2>";
        htmlResponse += "</html>";

        writer.println(htmlResponse);

    }
    public String getWindSpeed_unit() {
        return this.windSpeed_unit;
    }
    public String getLatitude() {
        return this.latitude;
    }
    public String getLongitude() {
        return this.longitude;
    }
    public String getStartDate() {
        return this.startDate;
    }
    public String getEndDate() {
        return this.endDate;
    }
}
