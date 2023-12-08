package com.dannyjae.jsonparsing.jsonsimple.object;

import lombok.Builder;
import lombok.ToString;

import java.util.List;

@ToString
@Builder
public class Student {
  private String name;
  private String classroom;
  private List<String> hobby;
}
