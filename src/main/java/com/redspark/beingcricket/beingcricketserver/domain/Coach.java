package com.redspark.beingcricket.beingcricketserver.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Coach {

    @Id
    @GeneratedValue
    private UUID id;
    private String firstName;
    private String surname;
    private String mainContactMethod;
    private String secondaryContactMethod;
    private String mobilePhoneNumber;
    private String emailAddress;
    private String landlinePhoneNumber;
    private boolean battingCoaching;
    private boolean fastBowlingCoaching;
    private boolean spinBowlingCoaching;
    private boolean fieldingCoaching;
    private boolean wicketKeepingCoaching;
    private boolean oneToOneCoaching;
    private boolean groupCoaching;
    private boolean clubCoaching;
    private String maxQualification;
    private String location;

    public String getMaxQualification() {
        return maxQualification;
    }

    public void setMaxQualification(String maxQualification) {
        this.maxQualification = maxQualification;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMainContactMethod() {
        return mainContactMethod;
    }

    public void setMainContactMethod(String mainContactMethod) {
        this.mainContactMethod = mainContactMethod;
    }

    public String getSecondaryContactMethod() {
        return secondaryContactMethod;
    }

    public void setSecondaryContactMethod(String secondaryContactMethod) {
        this.secondaryContactMethod = secondaryContactMethod;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getLandlinePhoneNumber() {
        return landlinePhoneNumber;
    }

    public void setLandlinePhoneNumber(String landlinePhoneNumber) {
        this.landlinePhoneNumber = landlinePhoneNumber;
    }

    public boolean isBattingCoaching() {
        return battingCoaching;
    }

    public void setBattingCoaching(boolean battingCoaching) {
        this.battingCoaching = battingCoaching;
    }

    public boolean isFastBowlingCoaching() {
        return fastBowlingCoaching;
    }

    public void setFastBowlingCoaching(boolean fastBowlingCoaching) {
        this.fastBowlingCoaching = fastBowlingCoaching;
    }

    public boolean isSpinBowlingCoaching() {
        return spinBowlingCoaching;
    }

    public void setSpinBowlingCoaching(boolean spinBowlingCoaching) {
        this.spinBowlingCoaching = spinBowlingCoaching;
    }

    public boolean isFieldingCoaching() {
        return fieldingCoaching;
    }

    public void setFieldingCoaching(boolean fieldingCoaching) {
        this.fieldingCoaching = fieldingCoaching;
    }

    public boolean isWicketKeepingCoaching() {
        return wicketKeepingCoaching;
    }

    public void setWicketKeepingCoaching(boolean wicketKeepingCoaching) {
        this.wicketKeepingCoaching = wicketKeepingCoaching;
    }

    public boolean isOneToOneCoaching() {
        return oneToOneCoaching;
    }

    public void setOneToOneCoaching(boolean oneToOneCoaching) {
        this.oneToOneCoaching = oneToOneCoaching;
    }

    public boolean isGroupCoaching() {
        return groupCoaching;
    }

    public void setGroupCoaching(boolean groupCoaching) {
        this.groupCoaching = groupCoaching;
    }

    public boolean isClubCoaching() {
        return clubCoaching;
    }

    public void setClubCoaching(boolean clubCoaching) {
        this.clubCoaching = clubCoaching;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
