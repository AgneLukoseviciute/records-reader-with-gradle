package com.lukoseviciute.programming.util;

import com.lukoseviciute.programming.models.Athlete;

import java.util.List;

public abstract class CompareHelper {

    public static void checkForDifferences(Athlete csvAthlete, Athlete otherAthlete) {
        checkRank(csvAthlete, otherAthlete);
        checkMark(csvAthlete, otherAthlete);
        checkName(csvAthlete, otherAthlete);
        checkDate(csvAthlete, otherAthlete);
        checkLocation(csvAthlete, otherAthlete);
    }

    public static void checkForDifferences(List<Athlete> csvAthletes, List<Athlete> otherAthletes, String otherFileType){

    }

    public static void checkRank(Athlete csvAthlete, Athlete otherAthlete) {
        if (csvAthlete.getRank() != otherAthlete.getRank()){
            System.out.println("Athlete: " + csvAthlete.getName() + ". Mismatch value: rank. CSV: " + csvAthlete.getRank() + ", JSON: " + otherAthlete.getRank());
        }
        else
            return;
    }

    public static void checkMark(Athlete csvAthlete, Athlete otherAthlete) {
        if (!(csvAthlete.getMark().equals(otherAthlete.getMark()))) {
            System.out.println("Athlete: " + csvAthlete.getName() + ". Mismatch value: mark. CSV: " + csvAthlete.getMark() + ", JSON: " + otherAthlete.getMark());
        }
        else
            return;
    }

    public static void checkName(Athlete csvAthlete, Athlete otherAthlete) {
        if (!(csvAthlete.getName().equals(otherAthlete.getName()))) {
            System.out.println("Athlete: " + csvAthlete.getName() + ". Mismatch value: name. CSV: " + csvAthlete.getName() + ", JSON: " + otherAthlete.getName());
        }
        else
            return;
    }

    public static void checkDate(Athlete csvAthlete, Athlete otherAthlete) {
        if (!(csvAthlete.getDate().equals(otherAthlete.getDate()))) {
            System.out.println("Athlete: " + csvAthlete.getName() + ". Mismatch value: date. CSV: " + csvAthlete.getDate() + ", JSON: " + otherAthlete.getDate());
        }
        else
            return;
    }

    public static void checkLocation(Athlete csvAthlete, Athlete otherAthlete) {
        if (!(csvAthlete.getLocation().equals(otherAthlete.getLocation()))) {
            System.out.println("Athlete: " + csvAthlete.getName() + ". Mismatch value: location. CSV: " + csvAthlete.getLocation() + ", JSON: " + otherAthlete.getLocation());
        }
        else
            return;
    }
}
