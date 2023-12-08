package com.dannyjae.jsonparsing.gson.object;

import com.google.gson.annotations.SerializedName;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class Sample {
  @SerializedName("id")
  private Long id;

  @SerializedName("name")
  private String name;
}
