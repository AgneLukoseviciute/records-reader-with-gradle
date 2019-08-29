package com.lukoseviciute.programming.util;

import com.lukoseviciute.programming.models.Athlete;

import java.util.HashMap;

public abstract class PrintDifferences {

    public static void printDiffsHashMap(HashMap<String, Athlete> hashOfDifferences, String otherFileType){
        System.out.println("pretend we're printing all the 'tweaks' for the " + otherFileType + "file.");
    }
}
