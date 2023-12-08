package com.dannyjae.jsonparsing.jackson.object;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Setter
public class Group {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("student_list")
  private List<Student> studentList;
}