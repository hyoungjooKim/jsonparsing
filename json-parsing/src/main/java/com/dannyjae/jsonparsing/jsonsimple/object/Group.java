package com.dannyjae.jsonparsing.jsonsimple.object;

import lombok.Builder;
import lombok.ToString;

import java.util.List;

@ToString
@Builder
public class Group {
  private Long id;
  private String name;
  private List<Student> studentList;
}
