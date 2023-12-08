package com.dannyjae.jsonparsing.jackson.object;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Setter
public class Student {
  @JsonProperty("name")
  private String name;

  @JsonProperty("classroom")
  private String classroom;

  @JsonProperty("hobby")
  private List<String> hobby;
}
