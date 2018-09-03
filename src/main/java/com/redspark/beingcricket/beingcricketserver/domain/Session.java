package com.redspark.beingcricket.beingcricketserver.domain;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
public class Session {

    @Id
    @GeneratedValue
    private UUID id;
    private Date startDateTime;
    private int minutesDuration;
    @ManyToOne(cascade = CascadeType.ALL)
    private Location sessionLocation;
    private SessionType sessionType;
    private SessionStatus sessionStatus;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Video> sessionVideos;

    public Session() {}

    public Session(Date startDateTime, int duration) {
        this.startDateTime = startDateTime;
        this.minutesDuration = duration;
    }

    public int getMinutesDuration() {
        return minutesDuration;
    }

    private void setMinutesDuration(int minutesDuration) {
        this.minutesDuration = minutesDuration;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Location getSessionLocation() {
        return sessionLocation;
    }

    public void setSessionLocation(Location sessionLocation) {
        this.sessionLocation = sessionLocation;
    }

    public List<Video> getSessionVideos() {
        return sessionVideos;
    }

    public void setSessionVideos(List<Video> sessionVideos) {
        this.sessionVideos = sessionVideos;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public SessionType getSessionType() {
        return sessionType;
    }

    public void setSessionType(SessionType sessionType) {
        this.sessionType = sessionType;
    }

    public SessionStatus getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(SessionStatus sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    public enum SessionType {
        GROUP,
        ONE_TO_ONE,
        CLUB
    }

    public enum SessionStatus {
        FREE,
        BOOKED,
        COMPLETE,
        AVAILABLE
    }

}
