package com.dannyjae.jsonparsing.gson.object;

import com.google.gson.annotations.SerializedName;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Setter
public class Student {
  @SerializedName("name")
  private String name;

  @SerializedName("classroom")
  private String classroom;

  @SerializedName("hobby")
  private List<String> hobby;
}
