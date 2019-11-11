package com.ln.demo.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * 日期时间工具类
 * 
 * @author Administrator
 *
 */
public final class DateTimeUtils {

	/**
	 * 得到UTC日期时间
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static Date getUTCDate(String date, String format) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		TimeZone utcZone = TimeZone.getTimeZone("UTC");
		simpleDateFormat.setTimeZone(utcZone);
		try {
			java.util.Date utcDate = simpleDateFormat.parse(date);
			return utcDate;
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 得到UTC日期时间
	 * 
	 * @param date
	 * @return
	 */
	public static Date getUTCDate(String date) {
		return getUTCDate(date, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	}

}
