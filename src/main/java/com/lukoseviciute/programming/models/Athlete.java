package com.lukoseviciute.programming.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class Athlete {

    public Athlete(){

    }

    public Athlete(int rank, String mark, String name, String date, String location) {
        this.rank = rank;
        this.mark = mark;
        this.name = name;
        this.date = date;
        this.location = location;
    }

    @SerializedName("Rank")
    @Expose
    private int rank;
    @SerializedName("Mark")
    @Expose
    private String mark;
    @SerializedName("Athlete")
    @Expose
    private String name;
    @SerializedName("Date")
    @Expose
    private String date;
    @SerializedName("Location")
    @Expose
    private String location;

    public int getRank() {
        return rank;
    }

    public String getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

}

