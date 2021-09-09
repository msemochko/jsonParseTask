package com.edu.learning;

import com.edu.learning.models.Root;
import com.edu.learning.tools.JsonBuilderHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        JsonBuilderHelper parser = new JsonBuilderHelper();
        Root root = parser.getRoot();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String fullJson = gson.toJson(root);

        System.out.println(fullJson);
    }
}
