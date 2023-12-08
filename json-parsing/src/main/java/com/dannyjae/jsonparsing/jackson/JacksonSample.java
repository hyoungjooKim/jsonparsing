package com.dannyjae.jsonparsing.jackson;

import com.dannyjae.jsonparsing.jackson.object.Group;
import com.dannyjae.jsonparsing.jackson.object.Sample;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JacksonSample {

  public void jsonToObject(String jsonStr) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    Sample sample = objectMapper.readValue(jsonStr, Sample.class);

    System.out.println(sample);
  }

  public void jsonToMap(String jsonStr) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    Map<String, Object> jacksonMap = objectMapper.readValue(jsonStr, new TypeReference<Map<String, Object>>(){});

    System.out.println(jacksonMap);
  }

  public void jsonArrayToObjectArray(String jsonStr) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    Sample[] sampleArr = objectMapper.readValue(jsonStr, Sample[].class);

    System.out.println(Arrays.toString(sampleArr));
  }

  public void jsonArrayToObjectList(String jsonStr) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    List<Sample> sampleList = objectMapper.readValue(jsonStr, new TypeReference<List<Sample>>(){});

    System.out.println(sampleList);
  }

  public void jsonNestedToObject(String jsonStr) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    Group group = objectMapper.readValue(jsonStr, Group.class);

    System.out.println(group);
  }
}
