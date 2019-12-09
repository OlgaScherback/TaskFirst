package model.entity;

public enum TextData {

    //nameOfNotes
    PlanDay ("Schedule", "Tasks", 1 ),
    Study ("LectureNotes", "HomeWork", 2 ),
    HomeAndFamily ("BirthdaysOfFamily", "Birthdays", 3),
    Travel ("Attractions", "Cities", 4),
    Motivation ("Psychology", "InnerWorld", 5),
    Books ("WhatToRead", "DifferentBooks", 6);




    TextData(String heading, String tag, int importance) {
        this.heading = heading;
        this.tag = tag;
        this.importance = importance;
    }

    private String heading;
    private String tag;
    private int importance;

    public String heading () { return heading;}
    public String tag() {
        return tag;
    }
    public int importance() { return importance;}
}

