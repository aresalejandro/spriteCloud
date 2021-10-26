package com.spritecloud.api.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {

    public static String getActualDateFormatted(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(getActualCalendar().getTime());
    }

    public static Calendar getActualCalendar() {
        return Calendar.getInstance();
    }

}