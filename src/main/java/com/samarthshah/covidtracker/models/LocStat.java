package com.samarthshah.covidtracker.models;

public class LocStat {

    private String State;
    private String Country;
    private int currentTotal;
    private int difference;

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getCurrentTotal() {
        return currentTotal;
    }

    public void setCurrentTotal(int currentTotal) {
        this.currentTotal = currentTotal;
    }

    @Override
    public String toString() {
        return "LocStat{" +
                "State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                ", currentTotal=" + currentTotal +
                '}';
    }

}
