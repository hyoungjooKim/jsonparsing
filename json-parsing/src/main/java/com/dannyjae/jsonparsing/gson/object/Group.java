package com.dannyjae.jsonparsing.gson.object;

import com.google.gson.annotations.SerializedName;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Setter
public class Group {
  @SerializedName("id")
  private Long id;

  @SerializedName("name")
  private String name;

  @SerializedName("student_list")
  private List<Student> studentList;
}
