package com.dannyjae.jsonparsing;

import com.dannyjae.jsonparsing.gson.GsonSample;
import com.dannyjae.jsonparsing.jackson.JacksonSample;
import com.dannyjae.jsonparsing.jsonsimple.JsonSimpleSample;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JsonParsingApplication {

  public static void main(String[] args) {
    SpringApplication.run(JsonParsingApplication.class, args);
  }

  @Bean
  public ApplicationRunner applicationRunner() {
    return new ApplicationRunner() {
      @Override
      public void run(ApplicationArguments args) throws Exception {

         /*
         {
           "id": 1,
           "name": "Anna"
         }
         */
            String jsonStr = "{\"id\" : 1, \"name\" : \"Anna\"}";

        /*
         [
           {
             "id": 1,
             "name": "Anna"
           },
           {
             "id": 2,
             "name": "Brian"
           }
         ]
         */
            String jsonArrStr = "[{\"id\" : 1, \"name\" : \"Anna\"}, {\"id\" : 2, \"name\" : \"Brian\"}]";

        /*
         {
           "id": 2,
           "group_name": "group1",
           "student_list": [
             {
               "name": "Danny",
               "classroom": "1-2",
               "hobby": ["golf", "tennis", "squash"]
             },
             {
               "name": "Tony",
               "classroom": "2-5",
               "hobby": ["football", "baseball", "basketball"]
             }
           ]
         }
         */
            String jsonNestedStr = "{\"id\":2,\"name\":\"group1\",\"student_list\":[{\"name\":\"Danny\",\"classroom\":\"1-2\",\"hobby\":[\"golf\",\"tennis\",\"squash\"]},{\"name\":\"Tony\",\"classroom\":\"2-5\",\"hobby\":[\"football\",\"baseball\",\"basketball\"]}]}";

            System.out.println("\n===== Gson json parsing start =====");
            GsonSample gsonSample = new GsonSample();
            gsonSample.jsonToObject(jsonStr);
            gsonSample.jsonToMap(jsonStr);
            gsonSample.jsonArrayToObjectArray(jsonArrStr);
            gsonSample.jsonArrayToObjectList(jsonArrStr);
            gsonSample.jsonNestedToObject(jsonNestedStr);
            System.out.println("===== Gson json parsing end =====\n");

            System.out.println("===== Jackson json parsing start =====");
            JacksonSample jacksonSample = new JacksonSample();
            jacksonSample.jsonToObject(jsonStr);
            jacksonSample.jsonToMap(jsonStr);
            jacksonSample.jsonArrayToObjectArray(jsonArrStr);
            jacksonSample.jsonArrayToObjectList(jsonArrStr);
            jacksonSample.jsonNestedToObject(jsonNestedStr);
            System.out.println("===== Jackson json parsing end =====\n");

            System.out.println("===== Json-simple json parsing start =====");
            JsonSimpleSample jsonSimpleSample = new JsonSimpleSample();
            jsonSimpleSample.jsonToObject(jsonStr);
            jsonSimpleSample.jsonToMap(jsonStr);
            jsonSimpleSample.jsonArrayToObjectArray(jsonArrStr);
            jsonSimpleSample.jsonArrayToObjectList(jsonArrStr);
            jsonSimpleSample.jsonNestedToObject(jsonNestedStr);
            System.out.println("===== Json-simple json parsing end =====\n");
          }
    };
  }

}
