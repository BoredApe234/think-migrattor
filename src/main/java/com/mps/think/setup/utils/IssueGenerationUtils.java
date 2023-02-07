package com.mps.think.setup.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import antlr.collections.List;

public class IssueGenerationUtils {

	private static boolean check(int[] arr, int toCheckValue) {

		boolean test = false;
		for (int element : arr) {
			if (element == toCheckValue) {
				test = true;
				break;
			}
		}

		return test;

	}

	public static void weekOfTheMonth() {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMMM yyyy");
		int count = 0;
		int[] ipweek = { 2, 3, 4 };
		int[] ipday = { 2, 4, 6 };
		int issue = 10;

		while (count < issue) {
			calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
			int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
			if (check(ipweek, weekOfMonth)) {
				System.out.println(dateFormat.format(calendar.getTime()));
				count++;
			}
			calendar.add(Calendar.DATE, 7);
			// int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
			// int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			//
			// if (check(ipweek,weekOfMonth)&&check(ipday,dayOfWeek)
			// ){//(weekOfMonth == 1 || weekOfMonth == 3) && (dayOfWeek ==
			// Calendar.MONDAY || dayOfWeek == Calendar.FRIDAY)) {
			// System.out.println(dateFormat.format(calendar.getTime()));
			// count++;
			// }
			//
			// calendar.add(Calendar.DATE, 1);
		}
	}

	public static void weekOfTheYear() {
		int[] ipweek = { 5, 6, 7, 52 };
		int[] ipday = { 2, 4, 6 };
		int issue = 10;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		int count = 0;
		while (count < issue) {
			calendar.add(Calendar.DATE, 1);
			int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			if (check(ipday, dayOfWeek) && check(ipweek, weekOfYear)) {
				System.out.println(dateFormat.format(calendar.getTime()));
				count++;
			}
		}

	}

	public static void monthOfTheYear() {
		int[] ipmonth = { 2, 3, 11 };
		int[] ipday = { 2, 6 };
		int day = 2;
		int issue = 30;

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		int count = 0;
		while (count < issue) {
			calendar.add(Calendar.MONTH, 1);
			int monthOfYear = calendar.get(Calendar.MONTH);
			if (check(ipmonth, monthOfYear)) {
				calendar.set(Calendar.DAY_OF_MONTH, 1);
				while (calendar.get(Calendar.DAY_OF_WEEK) != day) {
					calendar.add(Calendar.DATE, 1);
				}
				System.out.println(dateFormat.format(calendar.getTime()));
				count++;
			}
		}

		// Calendar calendar = Calendar.getInstance();
		// calendar.setTime(new Date());
		// SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		// int count = 0;
		// while (count < issue) {
		// calendar.add(Calendar.DATE, 1);
		// int monthOfYear = calendar.get(Calendar.MONTH);
		// int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		// if (check(ipday,dayOfWeek) &&check(ipmonth,monthOfYear)) {
		// System.out.println(dateFormat.format(calendar.getTime()));
		// count++;
		// }
		// }
	}

	public static void dayOfTheWeek() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy E");
		int count = 0;
		int issue = 20;
		int[] ipday = { 2, 3 };
		while (count < issue) {
			calendar.add(Calendar.DATE, 1);
			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
			if (check(ipday, dayOfWeek)) {
				System.out.println(dateFormat.format(calendar.getTime()));
				count++;
			}
		}
	}

	public static void dayOfTheMonth() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy E");
		Calendar cal = Calendar.getInstance();
		int count = 0;
		// int[] daysOfWeek = {Calendar.MONDAY, Calendar.TUESDAY,
		// Calendar.WEDNESDAY};
		int issue = 20;
		int[] daysOfWeek = { 1, 3, 6 };
		while (count < issue) {
			for (int dayOfWeek : daysOfWeek) {
				cal.set(Calendar.DAY_OF_WEEK, dayOfWeek);
				cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
				if (cal.getTime().after(new Date())) {
					Date result = cal.getTime();
					System.out.println(sdf.format(result));
					count++;
					if (count >= issue) {
						break;
					}
				}
			}
			cal.add(Calendar.MONTH, 1);
		}
	}

	public static ArrayList<String> dayOfTheYear(Integer[] arr, int issue) {
		// int issue = 20;
		// int[] daysOfYear = { 40, 90, 150, 240, 330 };
		ArrayList<String> list=new ArrayList<>();
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		int year = now.getYear();
		while (issue > 0) {
			for (int day : arr) {
				LocalDate date = LocalDate.ofYearDay(year, day);
				if (date.isBefore(now)) {
					date = date.plusYears(1);
				}
				issue = issue - 1;
				list.add(date.format(formatter));
				System.out.println(date.format(formatter));
				if (issue == 0) {
					break;
				}
			}
			year++;
		}
		System.out.println("@@@@ : "+list);
		return list;

	}

	public static void main(String[] args) {
		// weekOfTheMonth();
		// weekOfTheYear();

		// monthOfTheYear();
		// dayOfTheWeek();
		// dayOfTheMonth();
//		Integer[] daysOfYear = { 40, 90, 150, 240, 330 };
//		dayOfTheYear(daysOfYear, 20);

	}

}
