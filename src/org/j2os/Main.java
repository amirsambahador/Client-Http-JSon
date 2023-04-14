package org.j2os;

import org.j2os.geteway.API;
import org.j2os.http.Web;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name, family and salary");
        String jsonResponse = Web.sendRequestByGet(String.format(API.SAVE_PERSON,
                scanner.nextLine(),
                scanner.nextLine(),
                scanner.nextLine()));

        JSONParser jsonParser = new JSONParser();
        JSONArray jsonArray = (JSONArray) jsonParser.parse(jsonResponse);
        for (Object jsonObject : jsonArray) {
            JSONObject jsonInstance = (JSONObject) jsonObject;
            System.out.println(jsonInstance.get("id"));
            System.out.println(jsonInstance.get("name"));
            System.out.println(jsonInstance.get("family"));
            System.out.println(jsonInstance.get("salary"));
            System.out.println("************************");
        }
    }
}
