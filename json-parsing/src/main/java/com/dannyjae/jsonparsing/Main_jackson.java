package com.dannyjae.jsonparsing;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;


public class Main_jackson {
  static String jsonData=
          "{"
                  +       "\"movie1\": {"
                  +           "\"title\": \"Blame\","
                  +           "\"url\": \"https://yts.mx/movies/blame-2021\","
                  +       "},"
                  +       "\"movie2\": {"
                  +           "\"title\": \"Tethered\","
                  +           "\"url\": \"https://yts.mx/movies/tethered-2021\","
                  +       "},"
                  + "}";
  static String jsonData1 = "{"
            + "\"movie1\": {"
            + "\"title\": \"Blame\","
            + "\"url\": \"https://yts.mx/movies/blame-2021\""
            + "},"
            + "\"movie2\": {"
            + "\"title\": \"Tethered\","
            + "\"url\": \"https://yts.mx/movies/tethered-2021\""
            + "}"
            + "}";

  static class Jdata { // DTO

    private String title;
    private String url;


    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
  }
  public static void main(String[] args) {

    try{


        // JSON 데이터를 객체로 변환
        Map<String, Jdata> movieMap = new ObjectMapper().readValue(jsonData1, new TypeReference<Map<String, Jdata>>(){});

        // movie1 객체 출력
        Jdata movie1 = movieMap.get("movie1");

        // movie2 객체 출력
        Jdata movie2 = movieMap.get("movie2");

        System.out.println("--------Map movieMap--------");
        System.out.println(movieMap);
        System.out.println("--------Movie 1 / Movie 2 dto--------");
        System.out.println("Movie 1:");
        System.out.println("Title: " + movie1.getTitle());
        System.out.println("URL: " + movie1.getUrl());
        System.out.println("Movie 2:");
        System.out.println("Title: " + movie2.getTitle());
        System.out.println("URL: " + movie2.getUrl());
        System.out.println("---------------------");

    }catch (Exception e){

    }
  }
}
