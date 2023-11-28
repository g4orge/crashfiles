package com.example.eastcyclingclub;

import androidx.annotation.NonNull;

public class ClubOwnerEventsHelperClass {
    public String date;
    public String nameOfEvent;
    public String eventType;
    public String numberOfParticipants;

    public ClubOwnerEventsHelperClass(String date, String nameOfEvent, String eventType, String numberOfParticipants){
        this.date = date;
        this.nameOfEvent = nameOfEvent;
        this.eventType = eventType;
        this.numberOfParticipants = numberOfParticipants;
    }

    @NonNull
    public String toString(){
        return nameOfEvent + ", "+date + ", " + eventType + ", " + numberOfParticipants;
    }
}
