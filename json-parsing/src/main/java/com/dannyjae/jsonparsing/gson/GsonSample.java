package com.dannyjae.jsonparsing.gson;

import com.dannyjae.jsonparsing.gson.object.Group;
import com.dannyjae.jsonparsing.gson.object.Sample;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GsonSample {

  public void jsonToObject(String jsonStr) {
    Gson gson = new Gson();
    Sample sample = gson.fromJson(jsonStr, Sample.class);

    System.out.println(sample);
  }

  public void jsonToMap(String jsonStr) {
    Gson gson = new Gson();
    Map<String, Object> gsonMap = gson.fromJson(jsonStr, new TypeToken<Map<String, Object>>(){}.getType());

    System.out.println(gsonMap);
  }

  public void jsonArrayToObjectArray(String jsonStr) {
    Gson gson = new Gson();
    Sample[] sampleArr = gson.fromJson(jsonStr, Sample[].class);

    System.out.println(Arrays.toString(sampleArr));
  }

  public void jsonArrayToObjectList(String jsonStr) {
    Gson gson = new Gson();
    List<Sample> sampleList = gson.fromJson(jsonStr, new TypeToken<List<Sample>>(){}.getType());

    System.out.println(sampleList);
  }

  public void jsonNestedToObject(String jsonStr) {
    Gson gson = new Gson();
    Group group = gson.fromJson(jsonStr, Group.class);

    System.out.println(group);
  }
}
