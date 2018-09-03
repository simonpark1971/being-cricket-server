package com.redspark.beingcricket.beingcricketserver.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {

    private DateUtil() {}

    public static Date calculateEndDate(String startDate, int duration) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd yyyy");
        Date startDateAsDate = null;
        try {
            startDateAsDate = sdf.parse(startDate);
            Calendar cal = new GregorianCalendar();
            cal.setTime(startDateAsDate);
            cal.add(Calendar.MINUTE, duration);
            return cal.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Date getStartDate(String startDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd yyyy");
        try {
            return sdf.parse(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getTodaysDateAsString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(new Date());
    }
}
