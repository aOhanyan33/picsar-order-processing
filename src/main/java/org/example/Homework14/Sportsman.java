package org.example.Homework14;

public abstract class Sportsman {

    public enum SportCategory {
        SINGLE,TEAM

    }
    protected String sportname;
    protected SportCategory category;


    public  Sportsman (String sportname, SportCategory category) {
        this.sportname = sportname;
        this.category = category;

    }

    public abstract void play();

}
