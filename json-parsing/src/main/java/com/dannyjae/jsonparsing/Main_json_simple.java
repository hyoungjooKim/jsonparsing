package com.dannyjae.jsonparsing;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class Main_json_simple {
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
      // JSONParser로 JSONObject 객체
      JSONObject objData = (JSONObject)new JSONParser().parse(jsonData1);
// JSONObject 분리
      JSONObject movieData1 = (JSONObject)objData.get("movie1"); // movie1의 JSONObject 추출
      JSONObject movieData2 = (JSONObject)objData.get("movie2"); // movie2의 JSONObject 추출
// DTO 객체 생성
      Jdata movie1DTO = new Jdata(); // movieData1의 데이터를 넣을 DTO 객체 생성
      Jdata movie2DTO = new Jdata(); // movieData2의 데이터를 넣을 DTO 객체 생성
// DTO에 데이터 주입
      movie1DTO.setTitle((String) movieData1.get("title")); // movieData1의 데이터인 title 값 주입
      movie1DTO.setUrl((String) movieData1.get("url"));     // movieData1의 데이터인 url 값 주입
      movie2DTO.setTitle((String) movieData2.get("title")); // movieData2의 데이터인 title 값 주입
      movie2DTO.setUrl((String) movieData2.get("url"));     // movieData2의 데이터인 url 값 주입

    System.out.println(objData);
    System.out.println(movieData1);
    System.out.println(movieData2);
    System.out.println(movie1DTO.getTitle()+" / "+movie1DTO.getUrl());
    System.out.println(movie2DTO.getTitle()+" / "+movie2DTO.getUrl());
}catch(Exception e){

}
  }
}
