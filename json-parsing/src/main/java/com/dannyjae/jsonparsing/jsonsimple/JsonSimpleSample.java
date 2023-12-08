package com.dannyjae.jsonparsing.jsonsimple;

import com.dannyjae.jsonparsing.jsonsimple.object.Group;
import com.dannyjae.jsonparsing.jsonsimple.object.Sample;
import com.dannyjae.jsonparsing.jsonsimple.object.Student;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.*;

public class JsonSimpleSample {

  public void jsonToObject(String jsonStr) throws ParseException {
    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonStr);
    Sample sample = Sample.builder()
            .id((Long) jsonObject.get("id"))
            .name((String) jsonObject.get("name"))
            .build();

    System.out.println(sample);
  }

  public void jsonToMap(String jsonStr) throws ParseException {
    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonStr);
    Map<String, Object> jsonSimpleMap = new HashMap<>();
    jsonSimpleMap.put("name", jsonObject.get("name"));
    jsonSimpleMap.put("id", jsonObject.get("id"));

    System.out.println(jsonSimpleMap);
  }

  public void jsonArrayToObjectArray(String jsonStr) throws ParseException {
    JSONParser jsonParser = new JSONParser();
    JSONArray jsonArray = (JSONArray) jsonParser.parse(jsonStr);
    Sample[] sampleArr = new Sample[jsonArray.size()];
    for (int i=0;i<jsonArray.size();i++){
      JSONObject jsonObject = (JSONObject) jsonArray.get(i);
      sampleArr[i] = Sample.builder()
              .id((Long) jsonObject.get("id"))
              .name((String) jsonObject.get("name"))
              .build();
    }

    System.out.println(Arrays.toString(sampleArr));
  }

  public void jsonArrayToObjectList(String jsonStr) throws ParseException {
    JSONParser jsonParser = new JSONParser();
    JSONArray jsonArray = (JSONArray) jsonParser.parse(jsonStr);
    List<Sample> sampleList = new ArrayList<>();
    for (Object o : jsonArray) {
      JSONObject jsonObject = (JSONObject) o;
      sampleList.add(Sample.builder()
              .id((Long) jsonObject.get("id"))
              .name((String) jsonObject.get("name"))
              .build());
    }

    System.out.println(sampleList);
  }

  public void jsonNestedToObject(String jsonStr) throws ParseException {
    JSONParser jsonParser = new JSONParser();
    JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonStr);

    JSONArray jsonArray = (JSONArray) jsonParser.parse(jsonObject.get("student_list").toString());
    List<Student> studentList = new ArrayList<>();
    for (Object object : jsonArray) {
      JSONObject jsonObjectStudent = (JSONObject) object;

      JSONArray jsonArrayHobby = (JSONArray) jsonParser.parse(jsonObjectStudent.get("hobby").toString());
      List<String> hobbyList = new ArrayList<>();
      for (Object hobbyObject : jsonArrayHobby) {
        hobbyList.add(hobbyObject.toString());
      }

      studentList.add(Student.builder()
              .name((String) jsonObjectStudent.get("name"))
              .classroom((String) jsonObjectStudent.get("classroom"))
              .hobby(hobbyList)
              .build());
    }
    Group group = Group.builder()
            .id((Long) jsonObject.get("id"))
            .name((String) jsonObject.get("name"))
            .studentList(studentList)
            .build();

    System.out.println(group);
  }
}
