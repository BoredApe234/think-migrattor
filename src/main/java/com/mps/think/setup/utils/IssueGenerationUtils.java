package com.mps.think.setup.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


public class IssueGenerationUtils {


	public static ArrayList<Date> everyday(int issue, Date changeDate) {
		ArrayList<Date> list = new ArrayList<Date>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String cdate = dateFormat.format(changeDate);
		String[] str = cdate.split("-");
		int startYear = Integer.valueOf(str[0]);
		int currentMonth = Integer.valueOf(str[1]);
		String text = str[2];
		String[] dateTime = text.split(" ");
		int currentDate = Integer.valueOf(dateTime[0]);
		LocalDate now = LocalDate.of(startYear, currentMonth, currentDate);
		for (int i = 0; i < issue; i++) {
			Date date = java.sql.Date.valueOf(now.plusDays(i + 1));
			list.add(date);
		}
		System.out.println(list);
		return list;

	}

	public static ArrayList<Date> everyweek(int issue, String[] days, Date changeDate) {
		ArrayList<Date> list = new ArrayList<Date>();
		int[] ints = Arrays.stream(days).mapToInt(Integer::parseInt).toArray();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		String cdate = dateFormat.format(changeDate);
		String[] str = cdate.split("-");
		int startYear = Integer.valueOf(str[0]);
		int currentMonth = Integer.valueOf(str[1]);
		String text = str[2];
		String[] dateTime = text.split(" ");
		int currentDate = Integer.valueOf(dateTime[0]);
		Calendar calendar = Calendar.getInstance();
		calendar.set(startYear, currentMonth - 1, currentDate);
		int count = 0;
		while (count < issue) {
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			for (Integer d : ints) {
				if (dayOfWeek == d) {
					Date result = calendar.getTime();
					list.add(result);
					System.out.println(dateFormat.format(result));
					count++;
				}
			}
			calendar.add(Calendar.DATE, 1);
		}
		System.out.println(list);
		return list;
	}

	public static ArrayList<Date> everyMonth(int issue, String[] days, Date changeDate) {
		ArrayList<Date> list = new ArrayList<Date>();
		int[] ints = Arrays.stream(days).mapToInt(Integer::parseInt).toArray();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String cdate = dateFormat.format(changeDate);
		System.out.println("@@@@@@@@@@ sdfghjk:" + cdate);
		String[] str = cdate.split("-");
		int startYear = Integer.valueOf(str[0]);
		int currentMonth = Integer.valueOf(str[1]);
		String text = str[2];
		String[] dateTime = text.split(" ");
		int currentDate = Integer.valueOf(dateTime[0]);
		System.out.println("@@@@@@@@@@@@@ currentDate :" + currentDate);
		LocalDate now = LocalDate.of(startYear, currentMonth, currentDate);
		LocalDate currentdate = now.plusDays(1);
		int count = 0;
		while (count < issue) {
			for (int targetDate : ints) {
				if (currentdate.getDayOfMonth() == targetDate) {
					Date date = java.sql.Date.valueOf(currentdate);
					list.add(date);
					System.out.println(currentdate);
					count++;
					break;
				}
			}
			currentdate = currentdate.plusDays(1);
		}
		System.out.println(list);
		return list;

	}

	public static ArrayList<Date> everyYear(int issue, String[] days, Date changeDate) {
		ArrayList<Date> list = new ArrayList<Date>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String cdate = dateFormat.format(changeDate);
		String[] str = cdate.split("-");
		int startYear = Integer.valueOf(str[0]);
		// int currentMonth = Integer.valueOf(str[1]);
		// int currentDate = Integer.valueOf(str[0]);
		int count = 0;
		issue = issue + 1;
		while (count < issue) {
			for (String s : days) {
				String temp = startYear + "-" + s;
				if (count != 0) {
					Date date = java.sql.Date.valueOf(temp);
					
					list.add(date);
				}
				System.out.println(temp);
				count++;
				if (issue == count) {
					break;
				}
			}
			startYear++;
		}
		return list;

	}

}
