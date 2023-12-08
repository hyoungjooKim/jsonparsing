package com.dannyjae.jsonparsing;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Map;


public class Main_gson {
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

    // ObjectMapper로 Map 데이터 주입
    Map<String, Jdata> gsonMap = new Gson().fromJson(jsonData1, new TypeToken<Map<String, Jdata>>(){}.getType());
    // 각각의 객체 출력
    Jdata movie1 = gsonMap.get("movie1"); // movie1의 데이터를 넣을 DTO 객체 생성
    Jdata movie2 = gsonMap.get("movie2"); // movie2의 데이터를 넣을 DTO 객체 생성

}catch(Exception e){
    e.printStackTrace();
}
  }
}
