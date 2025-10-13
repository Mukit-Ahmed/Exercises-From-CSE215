
public class Exercise06_24 {
	static int daysElapsedCurrentYear;
	static int getDaysElapsedCurrentMonth;

	public static void main(String[] args) {
		String time = getCurrentTime(System.currentTimeMillis());
		String date = getCurrentDate(System.currentTimeMillis());
		System.out.println("The current date is " + date + ". And the current time is " + time);
	}

	public static String getCurrentDate(long timeMillis) {

		long seconds = timeMillis / 1000;
		long minutes = seconds / 60;
		long hour = minutes / 60;
		long days = hour / 24;

		int year = getYear((int)days);
		int month = getCurrentMonth(year, daysElapsedCurrentYear);
		return month + "/" + getDaysElapsedCurrentMonth + "/" + year;
	}

	private static int getCurrentMonth(int year, int daysElapsed) {
		int month = 1;
		while (daysElapsed >=getNumberOfDaysInAMonth(year, month)) {
			daysElapsed -= getNumberOfDaysInAMonth(year, month);
			month++;
		}
		getDaysElapsedCurrentMonth = daysElapsed+1;
		return month;
	}

	public static int getNumberOfDaysInAMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;

		return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) ? 29 : 28;

	}

	public static int getYear(int days) {
		int year = 1970;
		while (days >=numberOfDaysInAYear(year)) {
			days -= numberOfDaysInAYear(year);
			year++;
			daysElapsedCurrentYear = days;
		}
		return year;
	}

	public static int numberOfDaysInAYear(int year) {
		return (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) ? 366 : 365;
	}

	public static String getCurrentTime(long timeMillis) {
		long seconds = timeMillis / 1000;
		long currentSeconds = seconds % 60;

		long minutes = seconds / 60;
		long currentMinutes = minutes % 60;

		long hour = minutes / 60;
		long currentHour = hour % 24;

		return currentHour + ":" + currentMinutes + ":" + currentSeconds + "(GMT)";
	}
}
