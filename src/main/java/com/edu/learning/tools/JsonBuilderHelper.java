package com.edu.learning.tools;

import com.edu.learning.models.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonBuilderHelper {
    private Root root;
    private Gson gson;

    public JsonBuilderHelper(){

    gson = new GsonBuilder().create();
    FileReader fileReader = null;
        try {
            fileReader = new FileReader("settings.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        root = gson.fromJson(fileReader, Root.class);
    }
    public Root getRoot(){
        return root;
    }
}