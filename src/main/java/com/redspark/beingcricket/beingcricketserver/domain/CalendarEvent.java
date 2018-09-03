package com.redspark.beingcricket.beingcricketserver.domain;

import java.util.Date;

public class CalendarEvent {

    public CalendarEvent(String title, Date end, Date start) {
        this.title = title;
        this.end = end;
        this.start = start;
    }
    public String getTitle() {
        return title;
    }

    public Date getEnd() {
        return end;
    }

    public Date getStart() {
        return start;
    }

    private String title;
    private Date end;
    private Date start;
}
