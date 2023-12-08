package com.dannyjae.jsonparsing.jackson.object;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class Sample {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;
}
