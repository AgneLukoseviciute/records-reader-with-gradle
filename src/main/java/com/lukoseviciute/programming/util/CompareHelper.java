package com.lukoseviciute.programming.util;

import com.lukoseviciute.programming.models.Athlete;
import com.lukoseviciute.programming.models.Mismatch;

import java.util.ArrayList;
import java.util.List;

public abstract class CompareHelper {

    private static ArrayList<Mismatch> diffsInfo = new ArrayList<Mismatch>();

    public static void checkForDifferences(List<Athlete> csvAthletes, List<Athlete> otherAthletes, String otherFileType){

        //TODO: shouldn't need the -1 ??
        for (int i = 0; i < (csvAthletes.size() - 1) ; i++) {
            checkAllAttributes(csvAthletes.get(i), otherAthletes.get(i));
        }

        PrintDifferences.printDiffs(diffsInfo, otherFileType);
    }

    public static void checkAllAttributes(Athlete csvAthlete, Athlete otherAthlete) {
        checkRank(csvAthlete, otherAthlete);
        checkMark(csvAthlete, otherAthlete);
        checkName(csvAthlete, otherAthlete);
        checkDate(csvAthlete, otherAthlete);
        checkLocation(csvAthlete, otherAthlete);
    }


    public static void checkRank(Athlete csvAthlete, Athlete otherAthlete) {
        if (csvAthlete.getRank() != otherAthlete.getRank()){
            Mismatch tweak = new Mismatch
                    (csvAthlete.getName(), "Rank", Integer.toString(csvAthlete.getRank()), Integer.toString(otherAthlete.getRank()));
            diffsInfo.add(tweak);
        }
        else
            return;
    }

    public static void checkMark(Athlete csvAthlete, Athlete otherAthlete) {
        if (!(csvAthlete.getMark().equals(otherAthlete.getMark()))) {
            Mismatch tweak = new Mismatch
                    (csvAthlete.getName(), "Mark", csvAthlete.getMark(), otherAthlete.getMark());
            diffsInfo.add(tweak);
        }
        else
            return;
    }

    public static void checkName(Athlete csvAthlete, Athlete otherAthlete) {
        if (!(csvAthlete.getName().equals(otherAthlete.getName()))) {
            Mismatch tweak = new Mismatch
                    (csvAthlete.getName(), "Name", csvAthlete.getName(), otherAthlete.getName());
            diffsInfo.add(tweak);
        }
        else
            return;
    }

    public static void checkDate(Athlete csvAthlete, Athlete otherAthlete) {
        if (!(csvAthlete.getDate().equals(otherAthlete.getDate()))) {
            Mismatch tweak = new Mismatch
                    (csvAthlete.getName(), "Date", csvAthlete.getDate(), otherAthlete.getDate());
            diffsInfo.add(tweak);
        }
        else
            return;
    }

    public static void checkLocation(Athlete csvAthlete, Athlete otherAthlete) {
        if (!(csvAthlete.getLocation().equals(otherAthlete.getLocation()))) {
            Mismatch tweak = new Mismatch
                    (csvAthlete.getName(), "Location", csvAthlete.getLocation(), otherAthlete.getLocation());
            diffsInfo.add(tweak);
        }
        else
            return;
    }
}
