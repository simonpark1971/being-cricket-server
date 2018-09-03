package com.redspark.beingcricket.beingcricketserver.domain;

public class Player {

    public Player(String firstName, String surname) {

        this.firstName = firstName;
        this.surname = surname;
    }

    private String firstName;

    private String getCoachName() {
        return coachName;
    }

    private void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    private String coachName;

    private String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String surname;

}
