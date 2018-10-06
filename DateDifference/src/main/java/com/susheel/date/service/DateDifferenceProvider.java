package com.susheel.date.service;

import com.susheel.date.MyDate;

public class DateDifferenceProvider {
	
	
	private static int DAYS_IN_JAN = 31;
	private static int DAYS_IN_FEB = 28;
	private static int DAYS_IN_MAR = 31;
	private static int DAYS_IN_APR = 30;
	private static int DAYS_IN_MAY = 31;
	private static int DAYS_IN_JUN = 30;
	private static int DAYS_IN_JUL = 31;
	private static int DAYS_IN_AUG = 31;
	private static int DAYS_IN_SEP = 30;
	private static int DAYS_IN_OCT = 31;
	private static int DAYS_IN_NOV = 30;
	private static int DAYS_IN_DEC = 31;
	
	private static final int DAYS_IN_MONTH[] = {DAYS_IN_JAN, DAYS_IN_FEB, DAYS_IN_MAR,DAYS_IN_APR, DAYS_IN_MAY, DAYS_IN_JUN, DAYS_IN_JUL, DAYS_IN_AUG, DAYS_IN_SEP, DAYS_IN_OCT, DAYS_IN_NOV, DAYS_IN_DEC};

	public static int getDateDifference(MyDate startDate, MyDate endDate) {

		if(sameDate(startDate, endDate) && sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
			return 0;
		}
		else if(sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
			return endDate.getDd() - startDate.getDd();
		}
		else if(sameYear(startDate, endDate) && !(sameMonth(startDate, endDate))) {
			return remainingDaysInMonth(startDate) + daysInIntervingMonth(startDate, endDate) + leadingMonth(endDate);
		}
		else {
			return remainingDaysInYear(startDate) + daysInIntervingYear(startDate, endDate) + leadingYear(endDate);
		}
	}
	
	private static boolean sameDate(MyDate startDate, MyDate endDate) {
		return startDate.getDd() == endDate.getDd();
	}
	
	private static boolean sameMonth(MyDate startDate, MyDate endDate) {
		return startDate.getMm() == endDate.getMm();
	}
	
	private static boolean sameYear(MyDate startDate, MyDate endDate) {
		return startDate.getYyyy() == endDate.getYyyy();
	}
	
	private static int remainingDaysInMonth(MyDate startDate) {
		return DAYS_IN_MONTH[startDate.getMm() - 1] - startDate.getDd();
	}
	
	private static int daysInIntervingMonth(MyDate startDate, MyDate endDate) {
		int days = 0;
		for(int month = startDate.getMm(); month < endDate.getMm() - 1; month++) {
			days += DAYS_IN_MONTH[month];
		}
		if(isFebruary(startDate, endDate) && isLeapYear(startDate.getYyyy())) {
			days++;
		}
		return days;
	}
	
	private static int leadingMonth(MyDate endDate) {
		return endDate.getDd();
	}
	
	private static int remainingDaysInYear(MyDate startDate) {
		int days = remainingDaysInMonth(startDate);
		for(int month = startDate.getMm(); month < 12; month++) {
			days += DAYS_IN_MONTH[month];
		}
		/*if(isFebruary(startDate) && isLeapYear(startDate.getYyyy())) {
			System.out.println(startDate.getYyyy() + "true");
			days++;
		}*/
		return days;
	}
	
	private static int daysInIntervingYear(MyDate startDate, MyDate endDate) {
		int days = 0;
		int years = 0;
		years = endDate.getYyyy() - startDate.getYyyy() - 1;
		for(int year = startDate.getYyyy(); year < endDate.getYyyy(); year++ ) {
			if(isLeapYear(year))
				days++;
		}
		//for(int year = startDate.getYyyy(); year < endDate.getYyyy(); year++) {
			days += 365 * years;
		//}
		if(isLeapYear(startDate.getYyyy())) {
			days++;
		}
		return days;
	}
	
	private static int leadingYear(MyDate endDate) {
		int days = 0;
		if(isLeapYear(endDate.getYyyy())) {
			days++;
		}
		for(int month = 0; month < endDate.getMm() - 1; month++) {
			days += DAYS_IN_MONTH[month];
		}
		days += leadingMonth(endDate);
		return days;
	}
	
	public static boolean isLeapYear(int year) {
		  if (year % 4 != 0) {
		    return false;
		  } else if (year % 400 == 0) {
		    return true;
		  } else if (year % 100 == 0) {
		    return false;
		  } else {
		    return true;
		  }
		}
	
	public static boolean isFebruary(MyDate startDate, MyDate endDate) {
		for(int month = startDate.getMm() - 1; month < endDate.getMm(); month++) {
			if(DAYS_IN_MONTH[month]==DAYS_IN_FEB) {
				return true;
			}
		}
		return false;
	}
}
		