package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {

    public static String date2String(Date date, String pattern) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String time = simpleDateFormat.format(date);

        return time;
    }

    public static Date string2Date(String time, String pattern) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse(time);

        return date;
    }

}
