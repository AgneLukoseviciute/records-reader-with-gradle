package com.lukoseviciute.programming.util;

import com.lukoseviciute.programming.models.Athlete;
import com.lukoseviciute.programming.models.Mismatch;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class PrintDifferences {

    public static void printDiffs(ArrayList<Mismatch> arrayListOfDiffs, String otherFileType){

        if (arrayListOfDiffs.isEmpty()){
            System.out.println("No differences in " + otherFileType + "file.");
        }
        else {
            Mismatch currDiff;
            for(int i = 0; i<arrayListOfDiffs.size(); i++){
                currDiff = arrayListOfDiffs.get(i);
                System.out.println("For athlete: " + currDiff.getAthleteName() + " mismatch in " + currDiff.getAttribute() + ". CSV value: " + currDiff.getTrueVal() + ", " + otherFileType + " value: " + currDiff.getOtherVal());
            }
            System.out.println();
        }
    }
}
