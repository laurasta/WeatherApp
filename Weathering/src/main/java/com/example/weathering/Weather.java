package com.example.weathering;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



import java.net.HttpURLConnection;

import java.net.URL;

import java.util.Scanner;

@WebServlet("/Weather")
public class Weather extends HttpServlet {


    protected void doHttpGet(HttpServletRequest request,
                             HttpServletResponse response){
        //String url = "https://api.open-meteo.com/v1/forecast?
        // latitude=48.8567
        // &longitude=2.3510
        // &windspeed_unit=ms
        // &timezone=Europe%2FLondon
        // &start_date=2022-10-01
        // &end_date=2022-10-02";

        String apiEndPoint="https://api.open-meteo.com/v1/forecast?";
        //String latitude="48.8567";
        //String longitude="2.3510";
        //String windSpeed_unit = "ms";
        String timezone = "Europe%2FLondon";
        //String startDate=null; //optional (omit for forecast)
        //String endDate=null; //optional (requires a startDate if present)

        ChoiceServlet choice = new ChoiceServlet();
        String windSpeed_unit = choice.getWindSpeed_unit();
        String latitude = choice.getLatitude();
        String longitude = choice.getLongitude();
        String startDate = choice.getStartDate();
        String endDate = choice.getEndDate();

        StringBuilder requestBuilder=new StringBuilder(apiEndPoint);
        requestBuilder.append("latitude=").append(latitude).append("%longitude=").append(longitude).append("%windSpeed_unit=").append(windSpeed_unit).append("%timezone=").append(timezone);
        if (startDate!=null && !startDate.isEmpty())
        {
            requestBuilder.append("%start_date=").append(startDate);
            if (endDate!=null && !endDate.isEmpty())
            {
                requestBuilder.append("%end_date=").append(endDate);
            }
        }

        try {
            //Public API:
            //https://www.metaweather.com/api/location/search/?query=<CITY>
            //https://www.metaweather.com/api/location/44418/

            URL url = new URL(apiEndPoint);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            //Check if connect is made
            int responseCode = conn.getResponseCode();

            // 200 OK
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {

                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                //Close the scanner
                scanner.close();

                //System.out.println(informationString);


                //JSON simple library Setup with Maven is used to convert strings to JSON
                JSONParser parse = new JSONParser();
                JSONArray dataObject = (JSONArray) parse.parse(String.valueOf(informationString));

                //Get the first JSON object in the JSON array
                //System.out.println(dataObject.get(0));

                JSONObject countryData = (JSONObject) dataObject.get(0);

                System.out.println(countryData.get(""));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






