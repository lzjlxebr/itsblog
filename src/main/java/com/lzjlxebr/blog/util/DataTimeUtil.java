package com.lzjlxebr.blog.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * DataTimeUtil
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2019-08-27 18:25
 **/
public class DataTimeUtil {
    /**
     * 获取当前日期时间以字符串形式 yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String getCurrentDateTimeInString(){
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return dateFormat.format(calendar.getTime());
    }

    public static Date getCurrentDateTime() {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        return calendar.getTime();
    }

    public static Date setDate(Date date, int which, int count) {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.setTime(date);
        calendar.set(which, count);
        return calendar.getTime();
    }

    public static Date setDate(int which, int count) {
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        calendar.set(which, count);
        return calendar.getTime();
    }


    /**
     * 获取当前日期时间以字符串形式
     * @return
     */
    public static String getCurrentDateTimeInString(String format){
        Calendar calendar = Calendar.getInstance(Locale.CHINA);
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(calendar.getTime());
    }
    /**
     *
     * @param time1 第一个时间
     * @param time2 第二个时间
     * @return 如果第一个时间大于第二个时间则返回1，相等返回0，否则-1。报错-2
     */
    public static int compareDateTimeInString(String time1, String time2){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Long date1 = null;
        Long date2 = null;
        try {
            date1 = dateFormat.parse(time1).getTime();
            date2 = dateFormat.parse(time2).getTime();
            long diff = date1 - date2;

            return diff > 0 ? 1 : diff == 0 ? 0 : -1;
        } catch (ParseException e) {
            e.printStackTrace();
            return -2;
        }
    }

    public static String convertDateToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(date);
    }

    public static String convertDateTimeToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }

    public static String convertTimeToString(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        return dateFormat.format(date);
    }

    public static java.sql.Timestamp convertUtilDateToSQLTimestamp(Date date) {
        return new java.sql.Timestamp(date.getTime());
    }

    public static java.sql.Time convertUtilDateToSQLTime(Date date) {
        return new java.sql.Time(date.getTime());
    }

    public static java.sql.Date convertUtilDateToSQLDate(Date date) {
        return new java.sql.Date(date.getTime());
    }
}
